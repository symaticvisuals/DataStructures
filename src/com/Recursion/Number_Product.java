package com.Recursion;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Number_Product {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p=s.nextInt();
        System.out.println(numpro(n,p));
    }

    private static int numpro(int n, int p) {
        if(p==1)
        {
            return n;
        }
        return n*numpro(n,p-1);
    }
}
