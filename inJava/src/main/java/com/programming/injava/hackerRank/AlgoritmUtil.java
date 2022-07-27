package com.programming.injava.hackerRank;

import java.util.Arrays;

public class AlgoritmUtil {
    public static int findIndexOfValueInArr(int value, int[] arr) {
        // complexida de O(n), vai ser uma funçao linear, onde N é a quantidade de dados dentro do arr
        int k = arr.length - 1;
        while(k >= 0 && arr[k] != value) {
            k--;
        }
        return k;
    }

    public static int findIndexOfValueInArrRecursive(int value, int[] arr, int arrLength) {
        if(arrLength == 0) return -1;
        if(value == arr[arrLength - 1]) return arrLength - 1;
        return findIndexOfValueInArrRecursive(value, arr, arrLength - 1);
    }

    public static int removeIndexInArrAndReturnNewArrLength(int index, int[] arr) {
        for(int i = index; i < (arr.length - 1); i++) {
            arr[i] = arr[i+1];
        }
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println();
        return arr.length - 1;
    }

    public static int addValueInsideIndexInArrAndReturnNewArrLength(int value, int index, int[] arr) {
        for(int i = arr.length; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println();
        return arr.length + 1;
    }
}
