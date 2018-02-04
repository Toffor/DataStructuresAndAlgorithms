package com.coskunyalcinkaya;

import com.coskunyalcinkaya.sort.BubbleSort;

import java.util.Arrays;

public class Main {

    private static final int[] array = { 57, -6, 23, -1, 5, -8, 23, 56, 1 };


    public static void main(String[] args) {
        BubbleSort.sort(array);
        System.out.print(Arrays.toString(array));
    }
}
