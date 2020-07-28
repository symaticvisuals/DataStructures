package com.Recursion;

public class SplitArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5};
        spiltarray(arr,0,0,0,"","");

    }

    private static void spiltarray(int[] arr, int idx, int sum1, int sum2, String ans1, String ans2) {

    if(idx==arr.length)
    {
        if(sum1==sum2)
        {
            System.out.println(ans1+" and "+ans2);
        }
        return;
    }
    spiltarray(arr,idx+1,sum1+arr[idx],sum2,ans1+arr[idx]+" ",ans2);
    spiltarray(arr,idx+1,sum1,sum2+arr[idx],ans1,ans2+arr[idx]+" ");
    }
}
