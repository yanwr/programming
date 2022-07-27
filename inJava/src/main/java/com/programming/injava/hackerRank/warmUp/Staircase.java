package com.programming.injava.hackerRank.warmUp;

import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Staircase {
    // URL = https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
    public static void main(String[] args) {
        SpringApplication.run(Staircase.class, args);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long startTime = System.nanoTime();
            staircase(n);
        long endTime = System.nanoTime();

        System.out.println("Duration method in nanoSeconds ==> " + (endTime - startTime));
        scanner.close();
    }

    private static void staircase(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    private static void staircase2(int n) {
        String staircase = "#";
        for (int i = 1; i <= n; i++){
            System.out.printf("%" + (n) + "s \n", staircase);
            staircase += "#";
        }
    }
}
