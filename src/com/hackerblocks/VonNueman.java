package com.hackerblocks;

import java.util.Scanner;

public class VonNueman {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int j = 0; j < n; j++) {
            int temp = arr[j];
            double l = 0;
            double sum = 0;
            while (temp != 0) {
                int rem = temp % 10;
                double con = Math.pow(2, l);
                sum = sum + (rem * con);
                temp = temp / 10;
                l++;
            }
            arr[j] = (int)sum;

        }

        for (int m = 0; m < n; m++) {
            System.out.println(arr[m]);

        }
    }
}
