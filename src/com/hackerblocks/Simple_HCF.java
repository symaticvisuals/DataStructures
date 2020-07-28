package com.hackerblocks;

import java.util.Scanner;

public class Simple_HCF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]= new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
        }
        int l=findMax(a);
        find_HCF(a,l);

        }

    public static void find_HCF(int ar[],int max)
        {
            
        }

    public static int findMax(int ar[])
    {
        int max=ar[0];
        int i=1;
        while(i<ar.length)
        {
            if(ar[i]>max)
            {
                max=ar[i];
            }
        }
        return max;
    }
}
