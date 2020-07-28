package com.Recursion;

import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str= s.next();
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        if(str.compareTo(reversed)==0)
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
