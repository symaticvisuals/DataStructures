package com.Recursion;

public class FiboTriangle {
    public static void main(String[] args) {

    }
    public static int fibo(int n)
    {
        if(n<2)
            {
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
}
