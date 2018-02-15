package com.coskunyalcinkaya.sort;

/**
 * In-place algorithm
 * O(n^2) time complexity - quadratic (Worst case, if array almost sorted, it will perform better)
 * Does not need extra memory.
 * Unstable
 */
public class ShellSort extends Sort{


    @Override
    public void sort(int[] array) {

        for (int gap = array.length / 2; gap > 0; gap /= 2){

            for (int i = gap; i < array.length; i++){

                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement){
                    array[j] = array[j - gap];
                    j -= gap;

                }

                array[j] = newElement;
            }
        }
    }

}
