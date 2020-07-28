package com.Recursion;

import java.util.Scanner;

public class Increasing_Decreasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        p1(n);
    }

    private static void p1(int n) {
        if(n==0)
        {
            return;
        }
        System.out.println(n);//prints before the stack fills
        p1(n-1);
        System.out.println(n);//prints after the stack returns
    }


}
