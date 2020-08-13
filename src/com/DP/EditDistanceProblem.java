package com.DP;

import java.net.PortUnreachableException;
import java.security.PublicKey;

//TODO DYNAMIC PROGRAMMING
public class EditDistanceProblem {
    public static void main(String[] args) {
        String s1 = "dogs";
        String s2 = "doggo";
        int mem[][] = new int[s1.length()+1][s2.length()+1];
        System.out.println(EditdistanceTD(s1,s2,mem));
        System.out.println(EditDistanceIterative(s1,s2,mem));

    }

    //Recursion that will give TLE
    public static int EditDistance(String s1, String s2)
    {
        if(s1.length()==0)
        {
            return s2.length();
        }
        if(s2.length()==0)
        {
            return s1.length();
        }
        char f = s1.charAt(0);
        char s= s2.charAt(0);

        if(f==s)
        {
            return EditDistance(s1.substring(1),s2.substring(1));
        }
        else
        {
            return 1+Math.min(EditDistance(s1.substring(1), s2),//insert
                    Math.min(EditDistance(s1,s2.substring(1)), //delete
                            EditDistance(s1.substring(1),s2.substring(1)))); //replace
        }
    }

    //DP solution - Recursive
    public static int EditdistanceTD(String s1, String s2, int[][] mem)
    {
        if(s1.length()==0)
        {
            return s2.length();
        }
        if(s2.length()==0)
        {
            return s1.length();
        }
        if(mem[s1.length()][s2.length()]!=0)
        {
            return mem[s1.length()][s2.length()];
        }

        char f = s1.charAt(0);
        char s= s2.charAt(0);

        if(f==s)
        {
            mem[s1.length()][s2.length()]= EditdistanceTD(s1.substring(1),s2.substring(1),mem);
        }
        else
        {
            mem[s1.length()][s2.length()]= 1+Math.min(EditdistanceTD(s1.substring(1), s2,mem),//insert
                    Math.min(EditdistanceTD(s1,s2.substring(1),mem), //delete
                            EditdistanceTD(s1.substring(1),s2.substring(1),mem))); //replace
        }
        return mem[s1.length()][s2.length()];
    }

    public static int EditDistanceIterative(String s1, String s2, int[][]mem)
    {
        for (int i = 0; i <=s1.length() ; i++) {
            for (int j = 0; j <=s2.length() ; j++) {
                if(i==0)
                {
                    mem[i][j] =j;
                }
                else if(j==0)
                {
                    mem[i][j]=i;
                }
                else
                {
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                    {
                        mem[i][j]= mem[i-1][j-1];
                    }
                    else
                    {
                        mem[i][j] = 1+Math.min(mem[i-1][j], Math.min(mem[i-1][j-1],mem[i][j-1]));
                    }
                }
            }
        }
        return mem[s1.length()][s2.length()];
    }
}
