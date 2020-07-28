package com.hackerblocks;

import java.util.Arrays;
import java.util.Scanner;

public class Lexopermutation {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str= s.next();
        int[] fre = new int[26];

        frequency(fre,str);
        lexoperm("",fre,str.length(),str);


    }

    public static void lexoperm(String processed, int[] fre, int length, String str){
        if (length == 0) {
           // if(processed.compareTo(str)<0)
                System.out.println(processed);
            return;
        }

        for (int i = 0; i <fre.length ; i++) {

            if(fre[i]>0){
                fre[i]--;
                lexoperm(processed+(char)(i+'A'),fre,length-1,str);
                fre[i]++;
            }
        }
    }

    public static void frequency(int[] fre, String str){

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);
            fre[ch-'A']++;
        }
    }
}
