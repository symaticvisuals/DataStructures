package com.hackerblocks;

import java.util.Scanner;

public class Book_Allocation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        while(t-- >0)
        {
            int nop = s.nextInt();
            int nos=s.nextInt();
            int [] page = new int[nop];
            for (int i = 0; i <page.length ; i++) {
                page[i]= s.nextInt();
            }
            int lo = 0;
            int hi= 0;
            for (int i = 0; i <page.length ; i++) {
                hi+= page[i];
            }
            int ans =0;
            while(lo<=hi)
            {
                int mid = (lo+hi)/2;
                if(isitpossible(page,nos,mid)==true)
                {
                hi = mid-1;
                ans=mid;
                }
                lo=mid+1;
            }
            System.out.println(ans);
        }
    }
    public static boolean isitpossible(int page[],int nos,int mid)
    {
        int numberstudent=1;
        int pageread=page[0];
        int i=0;
        while(i<page.length)
        {
            if(page[i]+pageread<=mid)
            {
                pageread=pageread+page[i];
                i++;
            }
            else
            {
                numberstudent++;
                pageread=0;
            }
            if(numberstudent>0)
            {
                return false;
            }
        }
        return true;
    }
}
