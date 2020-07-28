package com.lec3;

import java.util.Scanner;

public class FindMaxUpgrade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println(maxVal(ar));

    }
    public static int maxVal(int ar[])
    {
        int max=ar[0];
        for (int i = 1; i <ar.length ; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }
}

