package com.coskunyalcinkaya.sort;

/**
 * In-place algorithm
 * O(n^2) time complexity - quadratic
 * Does not need extra memory.
 * Stable
 */
public class BubbleSort extends Sort {

    @Override
    public void sort(int[] array){
        for (int i = 1; i < array.length; i++){
            for (int j = 0; j < array.length - i; j++ ){
                if (array[j] > array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
    }


}
