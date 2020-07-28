package com.hackerblocks;

import java.util.Scanner;

public class Number_triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row=1;
        while(row<=n)
        {
            int space=1;
            while(space<=n-row)
            {
                System.out.print(" ");
                space++;
            }
            int col=1;
            int p=row-1;
            while(col<=2*row-1)
            {
                if(col<=row)
                {
                    p++;
                    System.out.print(p);
                }
                else
                {
                    p--;
                    System.out.print(p);
                }

                col++;
            }
            row++;
            System.out.println();
        }
    }
}
