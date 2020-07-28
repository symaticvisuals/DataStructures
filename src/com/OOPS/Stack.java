package com.OOPS;

import java.util.Arrays;

public class Stack {
    protected   int[] ar; //so that can be used after inheritance
    protected int top;
    protected int DEFAULT_SIZE=10;
    protected int size=0;
    public Stack()
    {
        this.ar = new int [DEFAULT_SIZE];
        this.top=0;
    }
    public void push(int element)
    {
//        if(isFull())
//        {
//            return;
//        }
        ar[top++]=element;
        size++;
    }
    public boolean isFull()
    {
        return top==ar.length;
    }
    public boolean isEmpty()
    {
        return top==0;
    }
    public int pop() throws Exception
    {
   if(isEmpty()) {
       throw new Exception("Abey khali hai");
   }
    //return --top;// for deleting element
        size--;
        return ar[--top]; //for showing popped element
    }
    public int peek()
    {

        return ar[top-1];
    }
    public void display()
    {
        for (int i = 0; i <size ; i++) {
            System.out.println(ar[i]);
        }
    }
}
