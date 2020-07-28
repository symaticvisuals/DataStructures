package com.Sorting;

import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        randomise(ar);
        int arr[] = divide(ar);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] divide(int[] ar) {

        if (ar.length == 1) {
            return ar;
        }

        int mid = ar.length / 2;

        int[] first = divide(Arrays.copyOfRange(ar, 0, mid));
        int[] second = divide(Arrays.copyOfRange(ar, mid, ar.length));

        return merger(first, second);
    }


    public static void randomise(int[] array) {


        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }

    }


    public static int[] merger(int[] first, int[] second) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] mix = new int[first.length + second.length];

        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                mix[k] = first[i];
                k++;
                i++;
            } else {
                mix[k] = second[j];
                k++;
                j++;
            }
        }

        while (i < first.length) {
            mix[k] = first[i];
            k++;
            i++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            k++;
            j++;
        }

        return mix;
    }
}
