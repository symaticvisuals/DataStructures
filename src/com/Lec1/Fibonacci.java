package com.Lec1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int f=0;
        int s=1;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n>0)
        {
            int t=f+s;
            f=s;
            s=t;
            n--;
        }
        System.out.println(f);
    }
}
