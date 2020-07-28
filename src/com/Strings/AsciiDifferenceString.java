package com.Strings;

import java.util.Scanner;
import java.util.SplittableRandom;

public class AsciiDifferenceString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String updated = "";
        StringBuilder update = new StringBuilder(updated);
        for (int i = 0; i <s1.length()-1 ; i=i+2) {
            calculatedif(s1.charAt(i),s1.charAt(i+1),update);
        }
        System.out.println(update);
    }

    private static void calculatedif(char ch1, char ch2,StringBuilder updated) {
        int dif= ch1-ch2;
        if(dif<0)
        {
            dif = dif+(2*dif);
        }
        updated.append(ch1);
        updated.append(dif);
        updated.append(ch2);

    }
}
