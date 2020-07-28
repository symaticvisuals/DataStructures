package com.lec3;

import java.util.Arrays;
import java.util.Scanner;

public class FindingMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();       //complexity bad
        }
        maxValue(ar);
    }

    public static void maxValue(int[] ar) {
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println(ar[ar.length-1]);
    }
}
