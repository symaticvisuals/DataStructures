package com.Practice;

import com.OOPS.CircularQueue;

public class StackClientt {
    public static void main(String[] args) {
//        StackPract stack = new StackPract();
//        stack.push(5);
//        stack.push(6);
//        System.out.println("Peak: "+stack.peak());
//        System.out.println();
//        System.out.println(stack.pop());
//        stack.push(7);
//        stack.display();
        CircularQueue queue = new CircularQueue();
        queue.insert(5);
        queue.insert(6);
        queue.insert(6);
        queue.insert(6);
        queue.insert(6);
        queue.delete();
        queue.delete();
        queue.insert(4);
    }
}
