package com.Practice;

import com.Lec7.BinarySearch;

import java.awt.desktop.PreferencesEvent;

public class QueuePrac {
    private int ar[];
    private int Default_Size =10;
    private int rear = 0;
    public QueuePrac()
    {
        this.ar = new int[Default_Size];
    }
    public boolean isFull()
    {
        return rear==ar.length;
    }
    public boolean isEmpty()
    {
        return rear==0;
    }
    public void insert(int element)
    {
        if(isFull())
        {
            return;
        }
        ar[rear++] = element;
    }
    public int delete()
    {
        if(isEmpty())
        {
            return -1;
        }
        int temp=ar[0];
        for (int i = 1; i <rear ; i++) {
            ar[i-1]=ar[i];
        }
        rear--;
        return temp;
    }
    public void display()
    {
        for (int i = 0; i <rear ; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}
