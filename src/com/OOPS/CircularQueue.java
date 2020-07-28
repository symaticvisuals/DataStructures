package com.OOPS;

public class CircularQueue {
    protected int[] ar;
    private int DEFAULT_SIZE=10;
    protected int rear=0;
    protected int front =0;
    public int size=0;
    public CircularQueue()
    {
        this.ar = new int [DEFAULT_SIZE];
    }
    protected boolean isFull()
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
        rear=rear%ar.length; //when rear reaches last it starts again from 0
        size++;
    }
    protected boolean isEmpty()
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
        front=front%ar.length;
        size--;
        return temp;
    }
    public void display()
    {
        for (int i = 0; i <size ; i++) {
            System.out.print(ar[(front+i)%ar.length]);
        }
    }

}
