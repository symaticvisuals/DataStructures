package com.hackerblocks;

import java.util.Scanner;
//TODO other approach also
public class Histogramnlogn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long ar[] = new long[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i] = s.nextLong();
        }
        System.out.println(Maxarea(ar,0,ar.length-1));
    }
    public static long Maxarea(long arr[],int start,int end )
    {
        if(start==end)
        {
            return arr[start];
        }
        if(start>end)
        {
            return 0;
        }
        long min_value=Long.MAX_VALUE;
        int min = -1;
        for (int i = start; i <=end ; i++) {
            if(arr[i]<min_value)
            {
                min_value=arr[i];
                min =i;
            }
        }
        long maxwidtharea = min_value*(end-start+1);
        long lma = Maxarea(arr,start,min-1);
        long rma = Maxarea(arr,min+1,end);
        return Math.max(maxwidtharea,Math.max(lma,rma));
    }

}
