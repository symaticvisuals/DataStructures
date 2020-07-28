package com.Recursion;

import java.util.Scanner;

public class DuplicateStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String str2 = "";
        StringBuilder sb=new StringBuilder(str2);
        String str1 = duplicate(str,sb,0).toString();
        System.out.println(str1);
    }

    private static StringBuilder duplicate(String str,StringBuilder sb, int i) {

        if(i>=str.length()-1)
        {
            sb.append(str.charAt(i));
            return sb;
        }
        if(str.charAt(i)==str.charAt(i+1))
        {
            sb.append(str.charAt(i));
            sb.append('*');
        }
        else {
            sb.append(str.charAt(i));
        }
        return duplicate(str,sb,i+1);
    }
}
