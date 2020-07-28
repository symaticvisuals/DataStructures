package com.hackerblocks;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] fre = new int[26];
        Scanner s = new Scanner(System.in);
        String str = s.next();
        frequency(fre,str);
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(fre[ch-'a']==1)
            {
                System.out.print(ch);
            }
            if (fre[ch-'a']>1)
            {
                System.out.print(ch);
                i++;
            }

        }

    }
    public static void frequency(int [] fre , String str)
    {
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            fre[ch-'a']++;
        }
    }

}
