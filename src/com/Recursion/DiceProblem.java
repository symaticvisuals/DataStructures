package com.Recursion;

import java.util.Scanner;

public class DiceProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        dicecount("",n);
        System.out.println(dicecounting(n));
    }

    public static void dicecount(String processed,int target)
    {
        if(target==0)
        {
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <=6 &&i<=target; i++) {
            dicecount(processed+i,target-i);
        }
    }
    public static int dicecounting(int target)
    {
        if(target==0)
        {

            return 1;
        }
        int cnt=0;
        for (int i = 1; i <=6 &&i<=target; i++) {
            cnt+=dicecounting(target-i);
        }
        return cnt;
    }
}
