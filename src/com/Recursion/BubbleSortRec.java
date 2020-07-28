package com.Recursion;

import java.util.Arrays;
import java.util.Scanner;

import com.Sorting.BubbleSort;

public class BubbleSortRec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ar[]= new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]= s.nextInt();
        }
        bubblesort(ar,ar.length-1,0);
        System.out.println(Arrays.toString(ar));
    }

    private static void bubblesort(int[] ar, int i, int j) {
        if(i==0)
        {
            return;
        }
        if(j==i)
        {
            bubblesort(ar,i-1,0);
            return;
        }
        if(ar[j]>ar[j+1])
        {
            BubbleSort.swap(i,j+1,ar);
        }
    }

}
