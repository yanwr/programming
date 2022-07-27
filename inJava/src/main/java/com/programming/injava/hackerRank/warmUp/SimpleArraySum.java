package com.programming.injava.hackerRank.warmUp;

import org.springframework.boot.SpringApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SimpleArraySum {
    // URL = https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
    public static void main(String[] args) {
        SpringApplication.run(SimpleArraySum.class, args);
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array = " + Arrays.toString(arr));

        long startTime = System.nanoTime();
            int result = simpleArraySum(Arrays.asList(arr));
        long endTime = System.nanoTime();

        System.out.println("Duration method in nanoSeconds ==> " + (endTime - startTime));
        System.out.println("Response = " + result);
        scanner.close();
    }

    public static int simpleArraySum(List<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    private static int simpleArraySumWithForIn(List<Integer> arr) {
        int sum = 0;
        for (Integer integer : arr) {
            sum += integer;
        }
        return sum;
    }

    private static int simpleArraySumWithStreamReduce(List<Integer> arr) {
       return arr.stream().reduce(0, Integer::sum);
    }
}
