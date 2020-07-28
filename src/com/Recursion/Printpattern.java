package com.Recursion;

import java.util.Scanner;

public class Printpattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int end=n;

        decend(end,n);


    }

    private static void decend(int end,int n) {
        if(end==0)
        {
            return;
        }
        printpattern(n);
        System.out.println();
        decend(end-1,n-1);
    }

    private static void printpattern(int n) {

        if(n==0)
        {
            return;
        }

        System.out.print("*");
        printpattern(n-1);

    }
}
