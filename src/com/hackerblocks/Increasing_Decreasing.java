package com.hackerblocks;

import java.util.Scanner;

public class Increasing_Decreasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int s1=0;
        int s2=1;
        int p=s.nextInt();
        while(n-1>0){
            int i = s.nextInt();
            if(s1==0){
                if(p>i){
                    p=i;
                }
                else{
                    s1=1;
                    s2=0;
                }
            }
            if(s2==0){
                if(p<i){
                    p=i;
                }
                else{
                    break;
                }
            }
            n--;
        }

        if(n==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
