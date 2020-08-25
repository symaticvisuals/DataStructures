package com.hackerblocks;

import java.util.Scanner;

public class Pascal_Triangle {
    static int factorial(int n) {
        int fact;

        for(fact = 1; n > 1; n--){
            fact *= n;
        }
        return fact;
    }
    static int ncr(int n,int r) {
        return factorial(n) / ( factorial(n-r) * factorial(r) );
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int j=0;
        int space=n;
        for(int i = 0; i < n; i++) {
            for (int k = 0; k<space-i-1 ;k++) {
                System.out.print("\t");
            }
            for(j = 0; j <= i; j++){
                System.out.print("\t"+ncr(i, j)+"\t");
            }
            System.out.println();
        }
    }
}