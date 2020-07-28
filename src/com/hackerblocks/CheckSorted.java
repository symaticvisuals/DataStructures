package com.hackerblocks;

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] ar = new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println(checksorted(ar,n));
    }

    private static boolean checksorted(int[] ar,int n) {
        if(n==1||n==0)
        {
            return true;
        }
        if(ar[n-1]<ar[n-2])
        {
            return false;
        }
        return checksorted(ar,n-1);

    }
}
