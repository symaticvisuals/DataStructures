package com.hackerblocks;

import java.util.Scanner;

public class Checkkarmstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int c=0,a,temp;
        int n=s.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
