package com.Recursion;

import java.util.Scanner;

public class Stringques {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1=s.next();
        subsequence("",s1);
    }
    public static void subsequence(String processed, String unprocessed)
    {
    if(unprocessed.isEmpty())
    {
        System.out.print(processed+" ");
        return;
    }


    char ch = unprocessed.charAt(0);
    unprocessed = unprocessed.substring(1);

        subsequence(processed,unprocessed);
        subsequence(processed+ch, unprocessed);

    }

}
