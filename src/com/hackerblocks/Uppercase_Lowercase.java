package com.hackerblocks;

import java.util.Scanner;

public class Uppercase_Lowercase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        int temp;
        if(c>='a'&&c<='z') {

            System.out.println("lowercase");
        }
        else if(c>='A'&&c<='Z'){

            System.out.println("UPPERCASE");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
