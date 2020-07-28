package com.Recursion;

import java.util.Scanner;

public class RecursiveTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(rectriangle(n));
    }

    private static int rectriangle(int n) {
        if(n==1)
        {
            return 1;
        }
        return n+rectriangle(n-1);
    }
}
