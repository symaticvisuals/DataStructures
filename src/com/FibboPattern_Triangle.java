package com;

import java.util.Scanner;

public class FibboPattern_Triangle {
    static void fib(int f[], int N)
    {

        f[1] = 0;
        f[2] = 1;

        for (int i = 3; i <= N; i++)


            f[i] = f[i - 1] + f[i - 2];
    }

    static void fiboTriangle(int n)
    {

        int N = n * (n + 1) / 2;
        int f[]=new int[N + 1];
        fib(f, N);


        int fiboNum = 1;


        for (int i = 1; i <= n; i++)
        {

            for (int j = 1; j <= i; j++)
                System.out.print(f[fiboNum++] + " ");

            System.out.println();
        }
    }


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        fiboTriangle(n);
    }
}
