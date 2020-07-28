package com.OOPS;

public class Queue_Optimised {
    private int[] ar;
    private int DEFAULT_SIZE=10;
    private int rear=0;
    private int front =0;
    int size=0;
    public Queue_Optimised()
    {
        this.ar = new int [DEFAULT_SIZE];
    }
    public boolean isFull()
    {
        return size==ar.length;
    }
    public void insert(int element)
    {
        if(isFull())
        {
            return;
        }
        ar[rear++]=element;
        size++;
    }
    private boolean isEmpty()
    {
        return size==0;
    }
    public int delete()
    {
        //deletion cost constant
        if(isEmpty())
        {
            return -1;
        }
        int temp=ar[front]; // for storing removed element

        front++;
        size--;
        return temp;
    }

}
