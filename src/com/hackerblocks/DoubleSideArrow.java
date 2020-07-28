package com.hackerblocks;

import java.util.Scanner;

public class DoubleSideArrow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int row=1;
        int k=1;
        int c=n-1;
        while(row<=n)
        {

            int space=1;
            while(space<=c)
            {
                System.out.print(" ");
                space++;
            }
            c=c-2;
            int col=1;
            int side=1;
            while(side<=(2*n)-1)
            {
                if(col<=row)
                {
                    System.out.print(col+" ");
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
