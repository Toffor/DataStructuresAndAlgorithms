package com.coskunyalcinkaya.sort;

/**
 * Not In-place algorithm
 * O(nlogn) time complexity
 * Does need extra memory.
 * Stable
 */
public class MergeSort extends Sort {


    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length);
    }


    private void mergeSort(int[] array, int start, int end){

        if (end - start < 2) return;

        int middle = (end + start) / 2;

        mergeSort(array, start, middle);

        mergeSort(array, middle, end);

        mergeArray(array, start, middle, end);
    }

    private void mergeArray(int array[], int start, int middle, int end){

        //Optimization for sorted parts.
        if (array[middle - 1] < array[middle]) return;

        int[] tempArray = new int[end - start];

        int tempIndex = 0;

        int i = start;
        int j = middle;

        while (i < middle && j < end){
            tempArray[tempIndex++] = array[i] < array[j] ? array[i++] : array[j++];
        }

        //For remaining value.
        while (i < middle){
            tempArray[tempIndex++] = array[i++];
        }

        while (j < end){
            tempArray[tempIndex++] = array[j++];
        }

        for (int number : tempArray) {
            array[start ++] = number;
        }

    }
}
