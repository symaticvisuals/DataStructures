package com.Assignment3;

import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(binarytodec(n));
    }

    public static int binarytodec(int n) {
        int temp = n;
        double l = 0;
        double sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            double con = Math.pow(2, l);
            sum = sum + (rem * con);
            temp = temp / 10;
            l++;
        }
        int temp2 = (int) sum;
        return temp2;
    }
}
