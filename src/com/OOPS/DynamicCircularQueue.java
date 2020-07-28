package com.OOPS;

public class DynamicCircularQueue extends CircularQueue {
    @Override
    public void insert(int element) {
        if(isFull())
        {
        int [] data = new int[2*ar.length];
            for (int i = 0; i <size ; i++) {
                data[i]= ar[(front+i)%ar.length];
            }
            front=0;
            rear=ar.length;
            ar=data;
        }
        super.insert(element);
    }
}
