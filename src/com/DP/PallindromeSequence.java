package com.DP;

public class PallindromeSequence {
    public static void main(String[] args) {
        String str= "aba";
        int [][] mem = new int[str.length()+1][str.length()+1];
        System.out.println(pallinseq(str,0,str.length()-1));
        System.out.println(pallinREC(str,0,str.length()-1,mem));
    }
    public static int pallinseq(String str, int start, int end)
    {
        if(start>end)
        {
            return 0;
        }
        if(start==end)
        {
            return 1;
        }

        if(str.charAt(start)==str.charAt(end))
        {
            return 2+pallinseq(str,start+1,end-1);
        }
        else
        {
            return Math.max(pallinseq(str,start+1,end),pallinseq(str,start,end-1));
        }
    }

    //TODO HARD ITERATIVE HAVE A LOOK
    public static int pallinIterative(String str, int start, int end, int[][] mem)
    {
    return 0;
    }

    //TOP DOWN
    public static int pallinREC(String str, int start, int end, int[][] mem)
    {
        if(start>end)
        {
            return 0;
        }
        if(start==end)
        {
            return 1;
        }
        if(mem[start][end]!=0)
        {
            return mem[start][end];
        }
        if(str.charAt(start)==str.charAt(end))
        {
            mem[start][end]= 2+pallinREC(str,start+1,end-1,mem);
        }
        else
        {
            mem[start][end]= Math.max(pallinREC(str,start+1,end,mem),pallinREC(str,start,end-1,mem));
        }
        return mem[start][end];
    }
}
