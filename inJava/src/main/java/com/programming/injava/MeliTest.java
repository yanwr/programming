package com.programming.injava;

import com.programming.injava.hackerRank.warmUp.TimeConversion;
import org.springframework.boot.SpringApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MeliTest {
    /*
        Complete a seguinte função para que a mesma devolva todos os possíveis números de 4 dígitos,
        onde cada um seja menor ou igual a <maxDigit>, e a soma dos dígitos de cada número gerado seja 21
        Exemplo maxDigit=6: 3666, 4566...
    */
    public static void main(String[] args) {
        SpringApplication.run(MeliTest.class, args);
        Scanner scanner = new Scanner(System.in);

        int maxDigit = scanner.nextInt();
        System.out.println("Input = " + maxDigit);

        long startTime = System.nanoTime();
            possibleNumbers(maxDigit);
        long endTime = System.nanoTime();

        System.out.println("Duration method in nanoSeconds ==> " + (endTime - startTime));
        scanner.close();
    }

    private static void possibleNumbers(int maxDigit) {
        int k = 1000;
        int maxK = 7770;
        while(k <= maxK) {
            List<String> kInListString = Arrays.stream(Integer.toString(k).split("")).collect(Collectors.toList());
            int sumEachNumberOfK = 0;
            int digits =  1;

            for(String eachNumberOfKInString : kInListString) {
               if(Integer.parseInt(eachNumberOfKInString) <= maxDigit) {
                   sumEachNumberOfK += Integer.parseInt(eachNumberOfKInString);
                   if(sumEachNumberOfK == 21) {
                       if(digits == 4) {
                           System.out.println(k);
                       }
                   }
               }
               digits++;
            }
            k++;
        }
    }
}
