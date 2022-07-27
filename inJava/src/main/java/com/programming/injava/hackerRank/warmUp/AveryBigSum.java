package com.programming.injava.hackerRank.warmUp;

import org.springframework.boot.SpringApplication;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AveryBigSum {
    // URL = https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true
    public static void main(String[] args) {
        SpringApplication.run(AveryBigSum.class, args);
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Long[] arr = new Long[size];
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextLong();
        }
        System.out.println("Array = " + Arrays.toString(arr));

        long startTime = System.nanoTime();
            long result = aVeryBigSum(Arrays.asList(arr));
        long endTime = System.nanoTime();

        System.out.println("Duration method in nanoSeconds ==> " + (endTime - startTime));
        System.out.println("Response = " + result);
        scanner.close();
    }

    public static long aVeryBigSum(List<Long> arr) {
        long sum = 0L;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}
