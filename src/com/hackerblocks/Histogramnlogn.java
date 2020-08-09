package com.hackerblocks;

import java.util.Scanner;
//TODO other approach also
public class Histogramnlogn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println(Maxarea(ar,0,ar.length-1));
    }
    public static int Maxarea(int arr[],int start,int end )
    {
        if(start==end)
        {
            return arr[start];
        }
        if(start>end)
        {
            return 0;
        }
        int min_value=Integer.MAX_VALUE;
        int min = -1;
        for (int i = start; i <=end ; i++) {
            if(arr[i]<min_value)
            {
                min_value=arr[i];
                min =i;
            }
        }
        int maxwidtharea = min_value*(end-start+1);
        int lma = Maxarea(arr,start,min-1);
        int rma = Maxarea(arr,min+1,end);
        return Math.max(maxwidtharea,Math.max(lma,rma));
    }

}
