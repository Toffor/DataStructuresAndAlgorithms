package com.coskunyalcinkaya;

import com.coskunyalcinkaya.sort.MergeSort;
import com.coskunyalcinkaya.sort.Sort;

import java.util.Arrays;

public class Main {

    private static final int[] array = { -222, 57, -6, 23, -1, 5, -8, 23, 56, 1, 34, -12, 122 };


    public static void main(String[] args) {
        Sort sort = new MergeSort();
        sort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
