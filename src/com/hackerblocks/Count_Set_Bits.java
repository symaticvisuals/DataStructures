package com.hackerblocks;

import java.util.Scanner;

public class Count_Set_Bits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }

        for (int j = 0; j <n ; j++) {
            int temp=arr[j];
            int count=0;
            while(temp!=0)
            {
               int l=temp%2;
               if(l==1)
               {
                   count++;
               }
               temp=temp/2;
            }
            System.out.println(count);
        }
    }
}
