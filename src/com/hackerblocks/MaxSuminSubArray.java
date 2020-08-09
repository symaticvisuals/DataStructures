package com.hackerblocks;

public class MaxSuminSubArray {
    public static void main(String[] args) {
    int ar [] = {-10,-5,10};
        System.out.println(Kadens(ar));
    }
    public static int Kadens(int ar[])
    {
        int ans = Integer.MIN_VALUE;
        int sum =0;
        for (int i = 0; i <ar.length ; i++) {
            sum+=ar[i];
            if(sum > ans)
            {
                ans = sum;
            }
            if(sum  < 0)
            {
                sum=0;
            }
        }
        return ans;
    }
}
