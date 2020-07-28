package com.hackerblocks;

import java.util.Scanner;

import static com.Recursion.Stringques.subsequence;

public class Subsequences {
    public static int count=0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1=s.next();
        subsequence("",s1);
        System.out.println();
        System.out.println(count);

    }
    public static void subsequence(String processed, String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            System.out.print(processed+" ");
            count++;
            return;

        }


        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        subsequence(processed,unprocessed);
        subsequence(processed+ch, unprocessed);

    }


}
