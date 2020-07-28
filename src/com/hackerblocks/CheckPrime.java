package com.hackerblocks;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int n;
        int count=2;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        int flag=5;
        while(count*count<n)
        {
            flag=0;
            if(n%count==0)
            {
                System.out.println("Not Prime");
            }
            else
            {
                count++;
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("Prime");
        }
    }
}
