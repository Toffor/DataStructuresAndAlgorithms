package com.coskunyalcinkaya;

import com.coskunyalcinkaya.datastructure.queue.QueueImpWithTwoStacks;

public class Main {

    private static final int[] array = { -222, 57, -6, 23, -1, 5, -8, 23, 56, 1, 34, -12, 122 };


    public static void main(String[] args) {


        QueueImpWithTwoStacks<Integer> queue = new QueueImpWithTwoStacks<>();


        for (int i : array){
            queue.enqueue(i);
        }

        while (queue.size() > 0){
            System.out.println(queue.dequeue());
        }
    }
}
