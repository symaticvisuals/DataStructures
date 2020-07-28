package com.hackerblocks;

import java.util.Arrays;
import java.util.Scanner;

public class OnlyLadder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ladders[] = MakeLadders(n);
        System.out.println("\n" + answerprint(n, ladders, 0, ""));
    }

    public static int answerprint(int n, int[] ladders, int cc, String ans) {
        if (cc == n) {
            System.out.print(ans + "END" + ", ");
            return 1;
        }
        if (cc > n) {
            return 0;
        }
        int c = 0;
        if (ladders[cc] != 0) {
            c += answerprint(n, ladders, ladders[cc], ans + cc + " ");
        } else {
            for (int i = 1; i <= 6; i++) {
                c += answerprint(n, ladders, cc + i, ans + cc + " ");
            }
        }
        return c;
    }

    public static boolean[] SOE(int n) {
        boolean primes[] = new boolean[n + 1];
        Arrays.fill(primes,true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i * i < primes.length; i++) {
            if (primes[i]) {
                for (int m = 2; m * i <= n; m++) {
                    primes[m * i] = false;
                }
            }
        }
        return primes;

    }

    public static int[] MakeLadders(int n) {
        boolean primes[] = SOE(n);
        int ans[] = new int[primes.length];
        int i = 0, j = ans.length - 1;
        while (i < j) {
            while (!primes[i]) {
                i++;

            }
            while (!primes[j]) {
                j--;

            }
            if (i < j) {
                ans[i] = j;
                i++;
                j--;
            }

        }
        return ans;

    }
}
