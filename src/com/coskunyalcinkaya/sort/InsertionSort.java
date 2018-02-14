package com.coskunyalcinkaya.sort;

/**
 * In-place algorithm
 * O(n^2) time complexity - quadratic
 * Does not need extra memory.
 * Stable
 */
public class InsertionSort extends Sort{

    @Override
    public void sort(int[] array) {

        for (int i = 1; i < array.length; i++){
            for (int j = i; j > 0; j--){
                if (array[j] < array[j - 1]){
                    swap(array, j, j -1);
                }
            }
        }
    }
}
