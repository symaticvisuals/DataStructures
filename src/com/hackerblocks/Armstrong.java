package com.hackerblocks;

import java.util.Scanner;

public class Armstrong {
    public static void Armstrong(int count,int l)
    {
        double sum=0;
        double f=l;
        while(l!=0)
        {
            int m = l%10;
            sum = sum + Math.pow(m,count);
            l=l/10;
        }
        if(sum==f)
        System.out.println("true");
        else
            System.out.println("false");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp=n;
        int count =0;
        while(temp!=0)
        {
            int l=temp%10;
            count++;
            temp=temp/10;
        }
        Armstrong(count,n);

    }
}
