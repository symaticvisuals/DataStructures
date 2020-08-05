package com.Practice;

public class StackPract {
    protected int [] ar;
    protected int top;
    protected int Default_Size = 10;
    protected int size =0;
    public StackPract()
    {
        this.ar = new int[Default_Size];
        this.top =0;
    }
    public boolean isFull(){
        return top==ar.length;
    }
    public boolean isEmpty()
    {
        return top==0;
    }
    public void push(int element)
    {
        if(isFull())
        {
            return;
        }
        ar[top++] = element;
        size++;
    }
    public int pop()
    {
        if(isEmpty())
        {
            return 0;
        }
        size--;
        return ar[--top];
    }
    public int peak()
    {
        if(isEmpty())
        {
            return 0;
        }
        return ar[top-1];
    }

    public void display()
    {
        for (int i = 0; i <size ; i++) {
            System.out.println(ar[i]);
        }
    }
}
