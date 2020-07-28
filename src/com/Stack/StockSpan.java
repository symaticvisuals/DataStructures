package com.Stack;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int[] price = new int[N];
        for (int i = 0; i <price.length ; i++) {
            price[i]=s.nextInt();
        }

        int [] ar = stockspan(price);
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.print("END");
    }
    public static int[] stockspan(int price[])
    {
        int [] span = new int[price.length];
        Stack<Integer> stack = new Stack<>();
        span[0]=1;
        stack.push(0);
        for (int i = 1; i < price.length; i++) {
            while (!stack.isEmpty() && price[stack.peek()]<price[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                span[i]= i+1;
            }
            else
            {
                span[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return span;
    }

}
