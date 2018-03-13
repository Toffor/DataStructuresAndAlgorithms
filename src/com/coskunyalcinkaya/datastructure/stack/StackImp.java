package com.coskunyalcinkaya.datastructure.stack;

public class StackImp<T>{

    private Element<T> top;

    int size = 0;

    public void push(T data){

        top = new Element(data, top);

        size++;
    }

    public T pop(){

        if (size == 0){
            return null;
        }

        T data = top.getData();

        top = top.getNext();

        size--;

        return data;
    }

    public T peek(){
        if (size == 0){
            return null;
        }

        return top.getData();
    }

    public int size(){
        return size;
    }


}
