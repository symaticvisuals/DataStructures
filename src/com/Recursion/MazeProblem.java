package com.Recursion;

import java.security.PublicKey;
import java.util.Scanner;

public class MazeProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row= s.nextInt();
        int col= s.nextInt();;
        int c = mazepathcnt(row,col, "");
        System.out.println();
        System.out.print(c);

    }
    public static int mazepathcnt(int row,int col, String ans)
    {

        if(row < 1 || col < 1) { //illegal base case
            return 0;
        }
        if(row==1 && col==1) {  //legal base case
            System.out.print(ans + " ");
            return 1;
        }
        return mazepathcnt(row-1,col, ans + 'V')+mazepathcnt(row,col-1, ans + 'H')+mazepathcnt(row-1,col-1, ans + 'D');
    }
}
