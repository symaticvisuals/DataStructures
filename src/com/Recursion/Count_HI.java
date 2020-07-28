package com.Recursion;

import java.util.Scanner;

public class Count_HI {
    public static int count=0;

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String unprocessed = s.next();
            String s1 = count_hi("",unprocessed);
            System.out.println(s1);
        }

    private static String count_hi(String processed, String unprocessed) {
        if(unprocessed.isEmpty())
        {
            System.out.println(count);
            return processed;
        }
        char ch = unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        if(ch=='h')
        {
            return count_hi(processed,unprocessed);

        }
        if(ch=='i')
        {
            count++;
            return count_hi(processed,unprocessed);

        }
        return count_hi(processed+ch,unprocessed);
    }
}
