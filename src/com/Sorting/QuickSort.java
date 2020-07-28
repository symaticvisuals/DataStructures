package com.Sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {

        int []ar= {1,2,3,4,5};
        randomise(ar);
        System.out.println(Arrays.toString(ar));
        divide(ar,0, ar.length);
        System.out.println(Arrays.toString(ar));
    }
    public static void randomise(int[] a) {
        int n = a.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            BubbleSort.swap(i,change,a);
        }
    }
    public static void divide(int []ar, int start, int end)
    {
        if(end<=start)//equals to is compulsory
            {
            return;
            }
        int pivot = end-1;
        pivot=quickSort(ar,start,pivot);
        divide(ar,0,pivot);
        divide(ar,pivot+1,end);
    }
    public static int quickSort(int []ar, int start, int pivot)
    {
        int j= start; //as after first  sort start will be other than zero
        for (int i = start; i <pivot ; i++) {
            if(ar[i]<ar[pivot])
            {
            BubbleSort.swap(i,j,ar);
            j++;
            }
        }
        BubbleSort.swap(pivot,j,ar);
        return j;
    }
}
