package com.Recursion;

import java.util.Scanner;

public class Stringsum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int sum =0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int n = (int)ch - 48;
            sum=sum+n;
        }
        System.out.println(sum);
    }
}
