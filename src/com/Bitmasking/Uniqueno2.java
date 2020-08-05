package com.Bitmasking;

public class Uniqueno2 {
    public static void main(String[] args) {
        int ar[] ={2,2,5,6,7,7};
        unique2(ar);
    }
    public static void unique2(int[] ar)
    {
        int res = 0;
        for (int i = 0; i <ar.length ; i++) {
            res = res^ar[i];
        }
        int temp = res;
        int cnt =0;
        while(temp!=0)
        {
            if((temp&1)==1)
            {
                break;
            }

                cnt = cnt+1;
                temp = temp>>1;
        }
        int x =0;
        int mask = 1<<cnt;
        for (int i = 0; i < ar.length; i++) {
            if((ar[i]&mask)>=1)
            {
                x=x^ar[i];
            }
        }
        int y = x^res;
        System.out.println(x+" "+y);
    }
}
