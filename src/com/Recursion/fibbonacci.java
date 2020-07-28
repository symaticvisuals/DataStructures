package com.Recursion;

import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if(n<2)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
