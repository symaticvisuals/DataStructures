package com.hackerblocks;

import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();

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
            int temp2= (int)sum;
        System.out.println(temp2);


    }
}
