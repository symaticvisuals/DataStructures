package com.hackerblocks;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=0;
        int j=10;
        int temp;
        while(j>1)
        {
            temp=s.nextInt();
            i=i+temp;
            if(i>=0)
            {
                System.out.println(temp);
            }
            else
            {
                break;
            }

        }
    }
}
