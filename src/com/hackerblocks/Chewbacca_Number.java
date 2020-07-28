package com.hackerblocks;

import java.util.Scanner;

public class Chewbacca_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long mul=1;
        long ans=0;
        while(n>9)
        {
            long rem= n%10;
            if(9-rem<rem)
            {
                ans = ans + mul*(9-rem);
            }
            else {
                ans = ans + mul * rem;
            }
            mul*=10;
            n/=10;
        }
        if(n==9)
        {
            ans = ans+n*mul;
        }
        if(9-n<n)
        {
            ans = ans + mul*(9-n);
        }
        else
        {
            ans = ans+mul*n;
        }
        System.out.println(ans);


    }
}
