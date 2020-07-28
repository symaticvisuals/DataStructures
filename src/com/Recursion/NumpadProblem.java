package com.Recursion;

import java.util.Scanner;

public class NumpadProblem {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        String str = s.next();
        numpad("",str);
    }
    public static void numpad(String processed, String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            System.out.print(processed+" ");
            return ;
        }
        int digit = unprocessed.charAt(0)-'0';
        unprocessed= unprocessed.substring(1);
        for (int i = 3*(digit-1); i <3*digit ; i++) {
            if(i==26)
            {
                continue;
            }
            numpad(processed+(char)(i+'a'),unprocessed);
            
        }

    }
    public static int count(String processed, String unprocessed)
    {
        if(unprocessed.isEmpty())
        {

        }
        return 0;
    }
}
