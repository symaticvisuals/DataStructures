package com.Lec7;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9};
        int arr1[] = {1, 2, 11, 13, 15};
        System.out.println(Arrays.toString(mergearrays(arr,arr1)));
    }

    public static int[] mergearrays(int arr1[], int arr2[]) {
        int ans[] = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                k++;
                i++;
            } else if (arr1[i] > arr2[j]) {
                ans[k] = arr2[j];
                k++;
                j++;
            } else {
                ans[k] = arr1[i];
                k++;
                i++;
                ans[k] = arr2[j];
                j++;
                k++;

            }

        }
        if (i == arr1.length) {
            while (j < arr2.length) {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        if (j == arr2.length) {
            while (i < arr1.length) {
                ans[k] = arr1[i];
                i++;
                k++;
            }
        }
        return ans;
    }
}