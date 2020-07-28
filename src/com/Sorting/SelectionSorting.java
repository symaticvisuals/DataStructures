package com.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSorting {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]= s.nextInt();
        }
        Selectionsort(ar);
        System.out.println(Arrays.toString(ar));
    }
    public static void Selectionsort(int ar[]) {
        for (int i = 0; i < ar.length; i++) {

               int max =  findMax(ar,0, ar.length-i-1);
               BubbleSort.swap(max,ar.length-i-1,ar);

        }
    }
    public static int findMax(int ar[],int start,int end)
    {
        int max= start;
        for (int i = 1; i <=end ; i++) {

            if(ar[i]>ar[max])
            {
                max=i;
            }
        }
        return max;
    }
}



