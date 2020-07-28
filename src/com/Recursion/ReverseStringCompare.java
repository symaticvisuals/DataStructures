package com.Recursion;

import java.util.Scanner;

public class ReverseStringCompare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        StringBuilder build = new StringBuilder(str2);
        String reversed = build.reverse().toString();
        if(str1.compareTo(reversed)==0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
