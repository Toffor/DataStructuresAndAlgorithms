package com.coskunyalcinkaya.sort;


/**
 * In-place algorithm
 * O(n^2) time complexity - quadratic
 * Does not need extra memory.
 * Unstable
 */
public class SelectionSort extends Sort{


    @Override
    public void sort(int[] array) {

        for (int i = array.length - 1; i > 0; i--){

            int indexOfLargest = 0;

            for (int j = 1; j <= i; j++){

                if (array[j] > array[indexOfLargest]){
                    indexOfLargest = j;
                }
            }

            swap(array, i, indexOfLargest);
        }
    }

}
