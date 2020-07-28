package com.Lec1;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row=1;
        int k=1;
        while(k <=2*n-1)
        {
            int space =1;
            while(space<=n-row)
            {
                System.out.print(" ");
                space++;
            }
            int col=1;
            while(col<=2*row-1)
            {
                System.out.print("*");
                col++;
            }
            System.out.println();
            if(k<n)
            {
                row++;
            }
            else
            {
                row--;
            }
            k++;
        }

    }
}
