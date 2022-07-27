package com.programming.injava.hackerRank.warmUp;

import org.springframework.boot.SpringApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTheTriplets {
    // URL = https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
    public static void main(String[] args) {
        SpringApplication.run(BirthdayCakeCandles.class, args);
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrA = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrA.add(scanner.nextInt());
        }
        List<Integer> arrB = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrB.add(scanner.nextInt());
        }
        System.out.println("Array A = " + arrA + "\n" + "Array B = " + arrB);

        long startTime = System.nanoTime();
        List<Integer> response = compareTriplets(arrA, arrB);
        long endTime = System.nanoTime();

        System.out.println("Duration method in nanoSeconds ==> " + (endTime - startTime));
        System.out.println("Response = " + response);
        scanner.close();
    }

    public static List<Integer> compareTriplets(List<Integer> aliceArr, List<Integer> bobArr) {
        List<Integer> score = new ArrayList<Integer>();
        int ALICE_SCORE_INDEX = 0, BOB_SCORE_INDEX = 1;
        score.add(0); score.add(0);
        for(int i = 0; i < 3; i++) {
            if(aliceArr.get(i) > bobArr.get(i)) {
                score.set(ALICE_SCORE_INDEX, score.get(ALICE_SCORE_INDEX) + 1);
            } else if(bobArr.get(i) > aliceArr.get(i)) {
                score.set(BOB_SCORE_INDEX, score.get(BOB_SCORE_INDEX) + 1);
            }
        }
        return score;
    }

}
