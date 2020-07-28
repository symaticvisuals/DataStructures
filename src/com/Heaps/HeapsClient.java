package com.Heaps;

import java.util.PriorityQueue;

public class HeapsClient {
    public static void main(String[] args) {
        Heaps heap = new Heaps();
        for (int i = 10; i >=0 ; i--) {
        heap.insert(i);
        heap.display();
        }
        for (int i = 0; i <11 ; i++) {
            heap.remove();
            heap.display();
        }
        System.out.println();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(1);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println();


    }
}
