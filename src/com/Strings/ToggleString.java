package com.Strings;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        StringBuilder str = new StringBuilder(s1);
        System.out.println(togglestring(str));
    }

    private static StringBuilder togglestring(StringBuilder s1) {
        for (int i = 0; i <s1.length() ; i++) {
            char ch=s1.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                ch=(char)('a'+(ch-'A'));
            }
            else
            {
                ch=(char)('A'+(ch-'a'));
            }
            s1.setCharAt(i,ch);
        }
        return s1;
    }
}
