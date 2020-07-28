package com.Recursion;

import java.util.Scanner;

public class AllXtoEnd {
    public static int count=0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String unprocessed = s.next();
        String s1 = allXtoend("",unprocessed);
        System.out.println(s1);
    }

    private static String allXtoend(String processed, String unprocessed) {
       if(unprocessed.isEmpty())
       {
           int i=0;
           while(i<count)
           {
               processed=processed+'x';
               i++;
           }
           return processed;
       }
        char ch = unprocessed.charAt(0);
       unprocessed=unprocessed.substring(1);
        if(ch=='x')
       {
        count++;
        return allXtoend(processed,unprocessed);
       }
        else
        {
            return allXtoend(processed+ch,unprocessed);
        }
    }
}
