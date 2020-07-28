package com.Lec7;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        //int arr[]={10,20,30,40,50};
        //System.out.println(BinarySearch(arr,40));
        int arr1[]={0,1,0,1,2,2};
        System.out.println(Arrays.toString(SortLinear(arr1)));


    }
    public static int BinarySearch(int arr[], int item)
    {
       int low=0;
       int high = arr.length-1;
       while(low<=high)
       {
           int mid=(low+high)/2;
           if(arr[mid]==item)
           {
               return mid;
           }
           else if(arr[mid]>item)
           {
               high = mid-1;
           }
           else if(arr[mid]<item)
           {
               low= mid+1;
           }
       }
       return -1;
    }
    public static int[] SortLinear(int arr[])
    {
        int mid=0; //
        int low=0; //
        int hi= arr.length-1; //2
        while(mid<=hi)
        {
            if(arr[mid]==0)
            {
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else if(arr[mid]==2)
            {
                swap(arr,mid,hi);
                //mid++;
                hi--;
            }

        }
        return arr;
    }
    public  static  void swap(int arr[], int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
}
