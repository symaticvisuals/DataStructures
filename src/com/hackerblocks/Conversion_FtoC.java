package com.hackerblocks;

import java.util.Scanner;

public class Conversion_FtoC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min=s.nextInt();
        int max=s.nextInt();
        int step=s.nextInt();
        while(min<=max)
        {
            System.out.print(min+" ");

            int c = (5*(min-32))/9;
            System.out.print(c);
            min=min+step;
            System.out.println();
        }
    }
}
