package com.hackerblocks;

import java.util.Scanner;

public class Decimal_To_Octal {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int arr[] = new int[100];
        int count=0;
        while(n!=0)
        {
            int l=n%8;
            n=n/8;
            arr[count]=l;
            count++;
        }
        int m=count-1;
        for (int j = m; j >=0 ; j--) {
            System.out.print(arr[j]);
        }

    }
}
