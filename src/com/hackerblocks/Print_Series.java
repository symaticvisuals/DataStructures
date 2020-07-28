package com.hackerblocks;

import java.util.Scanner;

public class Print_Series {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n=s.nextInt();
        int l=s.nextInt();
        int j=0;
        for(int i=1;j<n;i++)
        {
            int temp= (3*i)+2;
            if(temp%l!=0)
            {
                System.out.println(temp);
                j++;
            }

        }
    }
}
