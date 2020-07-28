package com.Assignment3;

import java.util.Scanner;

public class OctaltoBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[100];
        splitoct(n, ar);
    }

    public static void splitoct(int n, int[] ar) {
        int l = n;
        while (n != 0) {
            l = n % 10;
            convertBinary(l, ar);
            n = n / 10;
        }
    }

    public static void convertBinary(int m, int[] ar) {
        int i = ar.length;
        while (m != 0) {

        }
    }
}
