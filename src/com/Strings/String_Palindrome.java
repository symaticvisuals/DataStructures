package com.Strings;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        System.out.println(stringcheck(s1));
    }
    public static boolean stringcheck(String s1)
    {

        int end = s1.length()-1;
        for (int start = 0; start <end ; start++) {

            if(s1.charAt(start)!=s1.charAt(end))
            {
                return false;
            }
            end--;
        }
        return true;
    }
}
