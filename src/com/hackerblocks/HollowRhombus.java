package com.hackerblocks;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row=1;

        while(row<=n)
        {

            int space =1;
            while(space<=n-row)
            {
                System.out.print(" ");
                space++;
            }
            int col=1;
            while(col<=n)
            {
                if(row==1||row==n)
                {
                    System.out.print("*");
                }
                else if(col==1||col==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

                col++;
            }
            row++;
            System.out.println();
        }
    }
}
