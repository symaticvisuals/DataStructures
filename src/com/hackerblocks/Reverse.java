package com.hackerblocks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r =0;
        while(n!=0)
        {
            r=r*10;
            r=r+n%10;
            n=n/10;
        }
        System.out.println(r);
    }
}
