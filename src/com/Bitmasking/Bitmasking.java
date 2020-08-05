package com.Bitmasking;

import java.util.Scanner;

public class Bitmasking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        oddeven(n);
//        int a= s.nextInt();
//        int b= s.nextInt();
//        xorswap(a,b);
//        int ar[] = {2,2,5,7,7,8,8};
//        System.out.println(uniqueno(ar));
//        int a =5;
//        System.out.println(a>>>2);
        int a = 11;
        int b = 13;
        System.out.println(bitchange(a,b));

    }
    public static void oddeven(int n)
    {
        if((n&1)==1)
        {
            System.out.println("odd");
        }
        else
            System.out.println("even");
    }
    public static void xorswap(int a,int b)
    {
    a=a^b;
    b=a^b;
    a=a^b;
        System.out.println();
        System.out.println(a);
        System.out.println(b);
    }
    public static int uniqueno(int [] ar)
    {
        int res=0;
        for (int i = 0; i < ar.length; i++) {
            res = res^ar[i]; //nor

       }
        return res;
    }

    public static int bitchange(int from, int to)
    {
        int res =(from^to); //nor
        return setbitcount(res);
    }
    public static int setbitcount(int n)
    {
        int cnt =0;
        while (n!=0)
        {
            if((n&1)==1) //and
            {
                cnt++;
            }
            n=n>>1; //right shift
        }
        return cnt;
    }

}
