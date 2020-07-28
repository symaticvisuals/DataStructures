package com.Recursion;

public class Subset_subsequence {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        subset(arr,0,3,0,"");
    }
    public static void subset(int[] arr , int idx , int Target, int sum , String ans){
        if(sum==Target)
        {
            System.out.println(ans);
            return;
        }
        if(idx== arr.length)
        {
            return;
        }
        subset(arr,idx+1, Target, sum+arr[idx], ans+arr[idx]+" ");
        subset(arr,idx+1, Target,sum ,ans);
    }
}
