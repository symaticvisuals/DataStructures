package com.hackerblocks;

import java.util.Scanner;

public class Ultra_FastMathematicians {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0)
        {
            String s1 = s.next();
            String s2 = s.next();
            System.out.println(conversion(s1,s2));
            n--;

        }

    }
    public static String conversion(String s1, String s2)
    {
        String converse = "";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='1'&&s2.charAt(i)=='1')
            {
                converse=converse+'0';
            }
            else if(s1.charAt(i)=='0'&& s2.charAt(i)=='0')
            {
                converse=converse+'0';
            }
            else
            {
                converse=converse+'1';
            }
        }
        return converse;
    }
}
