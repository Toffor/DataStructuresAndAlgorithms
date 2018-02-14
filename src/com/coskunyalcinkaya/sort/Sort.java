package com.coskunyalcinkaya.sort;

public abstract class Sort {

    public abstract void sort(int[] array);


    void swap(int[] array, int i, int j){

        if (i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
