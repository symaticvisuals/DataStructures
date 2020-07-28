package com.hackerblocks;

import java.util.Scanner;

public class Rat_Chases_Cheese {
    public static boolean flag=false;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col= s.nextInt();
        int[][] sol = new int[row][col];
        char [][] maze = new char[row][col];
        for (int i = 0; i <row ; i++) {
            String str= s.next();
            for (int j = 0; j <str.length() ; j++) {
              maze[i][j]= str.charAt(j);
            }
        }
        solve(sol,maze,0,0,row-1,col-1);
        if(!flag)
        {
            System.out.println("NO PATH FOUND");
        }
    }
    public static void solve(int[][]sol, char [][] maze,int i,int j,int n,int m)
    {
        //illegal case
        if(i<0||j<0 || i>n||j>m||maze[i][j]=='X'||flag==true||sol[i][j]==1)  //flag for single solution
        {
            return;
        }
        //legal case
        if(i==n&&j==m)
        {

            flag=true;
            sol[i][j]=1;
            for (int x = 0; x <=n ; x++) {
                for (int y = 0; y <=m ; y++) {
                    System.out.print(sol[x][y]+" ");
                }
                System.out.println();
            }
        return;
        }
        sol[i][j]=1;
        solve(sol,maze,i,j-1,n,m);
        solve(sol,maze,i,j+1,n,m);
        solve(sol,maze,i-1,j,n,m);
        solve(sol,maze,i+1,j,n,m);

        sol[i][j]=0;
        return;
    }
}
