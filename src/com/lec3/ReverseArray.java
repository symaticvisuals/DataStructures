package com.lec3;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        //reverse(ar);
    }
    public static void swap(int start,int end,int ar[])
    {
        int temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
    }

    public static void reverse(int ar[],int start,int end)
    {

        while(start<end)
        {
            swap(start,end,ar);
         start++;
         end--;
        }
        System.out.println(Arrays.toString(ar));
    }
}
