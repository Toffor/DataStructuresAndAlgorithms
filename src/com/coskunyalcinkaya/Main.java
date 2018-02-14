package com.coskunyalcinkaya;

import com.coskunyalcinkaya.sort.SelectionSort;

import java.util.Arrays;

public class Main {

    private static final int[] array = { 57, -6, 23, -1, 5, -8, 23, 56, 1, 34, -12, 122 };


    public static void main(String[] args) {
        new SelectionSort().sort(array);
        System.out.print(Arrays.toString(array));
    }
}
