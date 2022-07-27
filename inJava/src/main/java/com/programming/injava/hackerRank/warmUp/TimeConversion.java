package com.programming.injava.hackerRank.warmUp;

import org.springframework.boot.SpringApplication;
import java.util.Scanner;

public class TimeConversion {
    // URL = https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
    public static void main(String[] args) {
        SpringApplication.run(TimeConversion.class, args);
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        System.out.println("Input = " + time);

        long startTime = System.nanoTime();
        String response = timeConversion(time);
        long endTime = System.nanoTime();

        System.out.println("Duration method in nanoSeconds ==> " + (endTime - startTime));
        System.out.println("Response = " + response);
        scanner.close();
    }

    private static String timeConversion(String s) {
        if(s.endsWith("PM")) {
            int hh = Integer.parseInt(s.substring(0, 2));
            if(hh == 12) {
                return s.substring(0, 8);
            }
            return Integer.toString(hh + 12).concat(s.substring(2, 8));
        };
        return s.startsWith("12") ? "00".concat(s.substring(2, 8)) : s.substring(0, 8);
    }
}
