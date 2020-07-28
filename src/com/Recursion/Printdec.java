package com.Recursion;

import java.util.Scanner;

public class Printdec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printdec(n);
    }

    private static void printdec(int n) {
        if(n==0)
            return;
        System.out.println(n);
        printdec(n-1);
    }
}
