package com.Recursion;

import java.util.Scanner;

public class Printing_Sequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printsequence(n,n);
    }

    private static void printsequence(int n,int j) {


        if(n<0)
        {
            return;
        }
        if(n%2!=0)
        {
            System.out.print(n);

        }
        printsequence(n-1,j);
        if(n>j)
        {
            return;
        }
        if(n%2==0&&n!=0)
        {
            System.out.print(n);
        }
        printsequence(n+1,j);

    }


}
