package com.OOPS;

public class DStackClient {
    public static void main(String[] args)throws Exception {
        DynamicStack stack = new DynamicStack();
        for (int i = 0; i <100 ; i++) {
            stack.push(i);

        }
        for (int i = 0; i <100 ; i++) {
            System.out.println(stack.pop());
        }

    }
}
