package com.programming.injava.hackerRank.warmUp;

import org.springframework.boot.SpringApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayCakeCandles {
    // URL = https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
    public static void main(String[] args) {
        SpringApplication.run(BirthdayCakeCandles.class, args);
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(scanner.nextInt());
        }
        System.out.println("Array= " + arr);

        long startTime = System.nanoTime();
        int response = birthdayCakeCandles(arr);
        long endTime = System.nanoTime();

        System.out.println("Duration method in nanoSeconds ==> " + (endTime - startTime));
        System.out.println("Response = " + response);
        scanner.close();
    }

    private static int birthdayCakeCandles(List<Integer> candles) {
        int tallestCandle = candles.get(0), counterTallest = 1;
        for(int i = 1; i < candles.size(); i++) {
            if(candles.get(i) == tallestCandle) {
                counterTallest++;
            }
            if(candles.get(i) > tallestCandle) {
                tallestCandle = candles.get(i);
                counterTallest = 1;
            }
        }
        return counterTallest;
    }
}
