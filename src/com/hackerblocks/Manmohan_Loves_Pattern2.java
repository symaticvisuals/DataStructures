package com.hackerblocks;

import java.util.Scanner;

public class Manmohan_Loves_Pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int top=0;
        int row=1;
        while(row<=5)
        {
            if(top==0)
            {
                System.out.print(row);
                top++;
            }
            else
            {
                int col=0;
                while(col<=top)
                {
                    if(col==0||col==top)
                        System.out.print(top);
                    else
                        System.out.print("0");
                    col++;
                }
                top++;
            }
            row++;
            System.out.println();
        }
    }
}
