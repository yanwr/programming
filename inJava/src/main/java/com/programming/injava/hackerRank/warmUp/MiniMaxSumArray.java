package com.programming.injava.hackerRank.warmUp;

import org.springframework.boot.SpringApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSumArray {
    // URL = https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
    public static void main(String[] args) {
        SpringApplication.run(MiniMaxSumArray.class, args);
        Scanner scanner = new Scanner(System.in);

        int size = 5;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(scanner.nextInt());
        }
        System.out.println("Array= " + arr);

        long startTime = System.nanoTime();
            miniMaxSum(arr);
        long endTime = System.nanoTime();

        System.out.println("Duration method in nanoSeconds ==> " + (endTime - startTime));
        scanner.close();
    }

    private static void miniMaxSum(List<Integer> arr) {
        long min = arr.get(0), max = min, sum = min;
        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.print((sum - max) + " " + (sum - min));
    }
}
