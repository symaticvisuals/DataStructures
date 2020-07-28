package com.hackerblocks;

public class TowerofHanoi {
    public static void main(String[] args) {
        int n = 3;
        TOH(n,"A","B","C"); //n , source, destination , helper
    }

    private static void TOH(int n, String A, String B, String C) {
        if(n==0)
        {
            return;
        }
        TOH(n-1,A,C,B);
        System.out.println("Move "+ n +"th Disk Source "+ A + " To Dist "+ B );
        TOH(n-1,C,B,A);
    }
}
