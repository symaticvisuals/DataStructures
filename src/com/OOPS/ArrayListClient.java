package com.OOPS;

public class ArrayListClient {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i <100 ; i++) {
            list.add(i);
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println(list.remove());
        }
    }
}
