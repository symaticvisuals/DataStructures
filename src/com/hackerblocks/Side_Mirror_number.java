package com.hackerblocks;

import java.util.Scanner;

public class Side_Mirror_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();

        int row=1;
        while(row<=n)
        {
            int side=1;
            int col=1;
            while(side<=(2*n)-1)
            {
                if(col<=row)
                {
                    System.out.print(col+"\t");
                }
                else
                {
                    System.out.print("\t");
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
            row++;
        }
    }
}
