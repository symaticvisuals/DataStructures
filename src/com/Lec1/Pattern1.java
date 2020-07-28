package com.Lec1;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row=1;
        int n = s.nextInt();
        while(row<=n)
        {
            int col=1;
            while(col<=row)
            {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
