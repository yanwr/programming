package com.programming.injava.hackerRank.warmUp;

import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {
    // URL = https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
    public static void main(String[] args) {
        SpringApplication.run(DiagonalDifference.class, args);
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Integer> arrRow = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                arrRow.add(scanner.nextInt());
            }
            matrix.add(arrRow);
        }
        System.out.println("Matrix = " + matrix);

        long startTime = System.nanoTime();
            int response = Math.abs(getDiagonalByType('P', matrix) - getDiagonalByType('S', matrix));
        long endTime = System.nanoTime();

        System.out.println("Duration method in nanoSeconds ==> " + (endTime - startTime));
        System.out.println("Response = " + response);
        scanner.close();
    }

    public static int diagonalDifference(List<List<Integer>> matrix) {
        int pDiagonal = 0;
        for(int i = 0; i < matrix.size(); i++) {
            for(int j = 0; j < matrix.size(); j++) {
                if(j == i) {
                    pDiagonal += matrix.get(i).get(j);
                }
            }
        }
        int sDiagonal = 0;
        for(int i = 0; i < matrix.size(); i++) {
            for(int j = 0; j < matrix.size(); j++) {
                if((j + i) == (matrix.size() - 1)) {
                    sDiagonal += matrix.get(i).get(j);
                }
            }
        }

        return Math.abs(pDiagonal - sDiagonal);
    }

    private static int getDiagonalByType(char diagonalType, List<List<Integer>> matrix) {
        int data = 0;
        for(int i = 0; i < matrix.size(); i++) {
            for(int j = 0; j < matrix.size(); j++) {
                switch (diagonalType) {
                    case 'P' :
                        if(j == i) data += matrix.get(i).get(j);
                        break;
                    case 'S' :
                        if((j + i) == (matrix.size() - 1)) data += matrix.get(i).get(j);
                        break;
                    default:
                        break;
                }
            }
        }
        return data;
    }
}
