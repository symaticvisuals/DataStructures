package com.hackerblocks;

import java.util.Scanner;

public class DeepakJourney {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();


        while(t-->0) {
            int n = s.nextInt();
            int C[] = new int[n];
            int L[] = new int[n];
            for (int i = 0; i < C.length; i++) {
                C[i] = s.nextInt();
            }
            for (int i = 0; i < L.length; i++) {
                L[i] = s.nextInt();
            }
            System.out.println(calculatecost(C, L));
        }

    }

    private static int calculatecost(int[] c, int[] l) {
        int sum=0;
        for (int i = 0; i <c.length ; i++) {
            sum = sum + c[i]*l[i];
        }
        return sum;
    }
}
