package com.coskunyalcinkaya.datastructure.queue;

import com.coskunyalcinkaya.datastructure.stack.StackImp;
import com.sun.istack.internal.Nullable;

public class QueueImpWithTwoStacks<T> {

    private StackImp<T> forwardStack = new StackImp<>();

    private StackImp<T> reverseStack = new StackImp<>();


    public void enqueue(T data){
        while (reverseStack.size() > 0){
            forwardStack.push(reverseStack.pop());
        }
        forwardStack.push(data);
    }

    @Nullable
    public T dequeue(){
        while (forwardStack.size() > 0){
            reverseStack.push(forwardStack.pop());
        }
        if (reverseStack.size() > 0){
            return reverseStack.pop();
        }
        return null;
    }

    public int size(){
        return forwardStack.size() + reverseStack.size();
    }
}
