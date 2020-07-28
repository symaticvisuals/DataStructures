package com.Recursion;

import java.util.Scanner;

public class FindM_in_N {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int m = s.nextInt();
        n= n-1;
        System.out.println(findM(arr,n,m));
    }
    public static int findM(int ar[],int n,int m)
    {

        if(ar[n]==m)
        {
            return n;
        }
        else if(n==0)
        {
            return -1;
        }

        return findM(ar,n-1,m);
    }
}
