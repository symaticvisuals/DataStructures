package com.Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class DecimaltoOctal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[100];
        dectooct(n, ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void dectooct(int n, int[] ar) {

        int count = 0;
        while (n != 0) {
            int l = n % 8;
            n = n / 8;
            ar[count] = l;
            count++;
        }
    }


}
