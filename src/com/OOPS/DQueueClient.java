package com.OOPS;

public class DQueueClient {
    public static void main(String[] args) {
        DynamicCircularQueue queue = new DynamicCircularQueue();
        for (int i = 0; i <100 ; i++) {
            queue.insert(i);
        }
        for (int i = 0; i <100 ; i++) {
            System.out.println(queue.delete());
        }
    }
}
