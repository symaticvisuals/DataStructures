package com.Recursion;

public class Sorted {
    public static void main(String[] args) {
        int [] ar = {4,1,2,3};
        System.out.println(checksort(ar,0));
    }
    public static boolean checksort(int ar[],int index)
    {
    if(index==ar.length-1)
    {
        return true;
    }
    if(ar[index]>ar[index+1])
    {
        return false;
    }
    return checksort(ar,index+1);
    }
}
