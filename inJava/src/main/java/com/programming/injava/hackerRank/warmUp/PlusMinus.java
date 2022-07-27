package com.programming.injava.hackerRank.warmUp;

import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
    // URL = https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
    public static void main(String[] args) {
        SpringApplication.run(PlusMinus.class, args);
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
           arr.add(scanner.nextInt());
        }
        System.out.println("Array = " + arr);

        long startTime = System.nanoTime();
            plusMinus(arr, size);
        long endTime = System.nanoTime();

        System.out.println("Duration method in nanoSeconds ==> " + (endTime - startTime));
        scanner.close();
    }

    private static void plusMinus(List<Integer> arr, int size) {
        float positives = 0, negatives = 0, zeros = 0;
        for(int i = 0; i < size; i++) {
            if(arr.get(i) < 0) negatives++;
            else if(arr.get(i) > 0) positives++;
            else zeros++;
        }
        System.out.format("%1.6f", positives / size).println();
        System.out.format("%1.6f", negatives / size).println();
        System.out.format("%1.6f", zeros / size).println(); //1688976
    }
}
