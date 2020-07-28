package com.Strings;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        StringBuilder builder = new StringBuilder(str);
        System.out.println(stringcompression(builder));

    }

    private static String stringcompression(StringBuilder builder) {
        int count=1;
        StringBuilder str1= new StringBuilder("");
        for (int i = 1;i < builder.length()-1 ; i++) {
        if(builder.charAt(i-1)==builder.charAt(i)){
            count++;
        }
        else
        {
            str1.append(builder.charAt(i-1));
            str1.append(count);
            count=1;
        }
        }
        //Count the last character of the string
        if (builder.length() > 1)
        {
            //Compare the last two characters of the string
            if (builder.charAt(builder.length() - 1) == builder.charAt(builder.length() - 2))
            {
                count++;
            }
            else
            {
                str1.append(builder.charAt(builder.length() - 2));
                str1.append(count);
                count = 1;
            }
            str1.append(builder.charAt(builder.length() - 1));
            str1.append(count);
        }
        String s1 = str1.toString();
        return s1;
    }


}
