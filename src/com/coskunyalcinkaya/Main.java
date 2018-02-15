package com.coskunyalcinkaya;

import com.coskunyalcinkaya.basic.Factorial;
import com.coskunyalcinkaya.sort.ShellSort;
import com.coskunyalcinkaya.sort.Sort;

public class Main {

    private static final int[] array = { 57, -6, 23, -1, 5, -8, 23, 56, 1, 34, -12, 122 };


    public static void main(String[] args) {
        Sort sort = new ShellSort();
        sort.sort(array);
        System.out.print(new Factorial().factorialRecursive(4));
    }
}
