package com.Lec1;

import java.util.Scanner;

public class StarPattern_Sidemirror {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int k=1;
        int row=1;
        while(k<=(2*n)-1)
        {
            int side=1;
            int col=1;
            while(side<=(2*n)-1)
            {
                if(col<=row)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                if(side<n)
                {
                    col++;
                }
                else
                {
                    col--;
                }
                side++;
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
