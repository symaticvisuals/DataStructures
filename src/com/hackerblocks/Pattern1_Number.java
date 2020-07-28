package com.hackerblocks;

import java.util.Scanner;

public class Pattern1_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int row=0;
        int p=0;
        while(row<n)
        {
            int space =1;
            while(space<=(n-row))
            {
                System.out.print(space+" ");
                space++;
            }
            if(p!=0)
            {
                int col = 1;
                while (col <= 2 * row - 1)
                {
                    System.out.print("*"+" ");
                    col++;
                }
            }
            p++;
            row++;
            System.out.println();
        }
    }
}
