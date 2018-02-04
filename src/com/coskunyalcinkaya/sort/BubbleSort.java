package com.coskunyalcinkaya.sort;

import java.util.Arrays;

/**
 * In-place algorithm
 * O(n^2) time complexity - quadratic
 * Does not need extra memory.
 */
public class BubbleSort {

    public static void sort(int[] array){
        for (int i = 1; i < array.length; i++){
            for (int j = 0; j < array.length - i; j++ ){
                if (array[j] > array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
    }



    static private void swap(int[] array, int i, int j){

        if (i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
