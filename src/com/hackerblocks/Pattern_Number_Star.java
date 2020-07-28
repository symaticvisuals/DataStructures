package com.hackerblocks;

import java.util.Scanner;

public class Pattern_Number_Star {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n=s.nextInt();
        int row=1;
        while(row<=n)
        {
            int col=1;
            while(col<=n)
            {
                if(col<=row)
                {
                    System.out.print(col);
                }
                else
                {
                    System.out.print("*");
                }
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
