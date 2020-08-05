package com.Bitmasking;

import java.util.Scanner;

public class IncredibleHulk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0) {
            int n = s.nextInt();
            System.out.println(setbitcount(n));
        }
    }


    public static int setbitcount(int n) {
        int cnt = 0;
        while (n != 0) {
            if ((n & 1) == 1) //and
            {
                cnt++;
            }
            n = n >> 1; //right shift
        }
        return cnt;
    }
}