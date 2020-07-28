package com.hackerblocks;

import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 0;
        int val = 1;
        while (row < n) {
            int col = 0;
            while (col <= row) {
                System.out.print(val + " ");
                val = (val * (row - col)) / (col + 1);
                col++;
            }
            System.out.println();
            row++;

        }
    }
}