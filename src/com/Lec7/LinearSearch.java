package com.Lec7;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int ar[]= {3,5,2,1,7};
        System.out.println(linear(ar,2));
    }
    public static int linear(int[] ar, int element)
    {
        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]==element)
            {
                return  i;
            }
        }
        return -1;
    }
}
