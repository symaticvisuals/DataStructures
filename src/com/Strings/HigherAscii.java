package com.Strings;

import java.util.Scanner;

public class HigherAscii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        StringBuilder builder = new StringBuilder(str);
        System.out.println(higherascii(builder));
    }

    private static StringBuilder higherascii(StringBuilder builder) {
        for (int i = 0; i <builder.length() ; i++) {
            char ch = builder.charAt(i);
            if(i%2==0)
            {
                ch= (char) ((char)ch-1);
            }
            else
                ch= (char) ((char)ch+1);
            builder.setCharAt(i,ch);
        }
        return builder;
    }
}
