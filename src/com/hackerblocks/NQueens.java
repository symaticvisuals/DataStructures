package com.hackerblocks;

import java.util.Scanner;

public class NQueens {
    public static int count =0;
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        boolean [][] board = new boolean[n][n];
        nqueens(board,0);
        System.out.println(count);
    }

    private static void nqueens(boolean[][] board, int row) {
        if(row== board.length)
        {
            count++;
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col))
            {
                board[row][col] = true;
                nqueens(board,row+1);
                board[row][col] = false; //backtracking
            }

        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check up
        for (int i = 0; i <row ; i++) {
            if(board[i][col])
            {
                return false;
            }
        }
        int left = Math.min(row,col);

        for (int i = 0; i <=left; i++) {

            if(board[row-i][col-i])
            {
                return false;
            }
        }
        int right = Math.min(row, board.length-col-1);
        for (int i = 0; i <=right ; i++) {

            if(board[row-i][col+i])
            {
                return false;
            }
        }
        return true;

    }
}
