package com.OOPS;

import java.util.Scanner;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack stack = new Stack();
        int n = s.nextInt();
        for (int i = 0; i <n ; i++) {
            int element = s.nextInt();
            stack.push(element);
        }
        reverseStack(stack,0);
        stack.display();
    }

    private static void reverseStack(Stack stack,int index) {

        if(index==0)
        {
            return;
        }
        stack.pop();
        reverseStack(stack,index+1);
        stack.push(stack.pop());


    }
}
