package com.DP;

import java.util.Scanner;

public class EggDrop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int eggs = s.nextInt();
        int floor = s.nextInt();
        System.out.println(eggdrop(eggs,floor));
    }
    public static int eggdrop(int eggs, int floor)
    {
        if(eggs==1)
        {
            return floor;
        }
        if(floor == 0 || floor==1)
        {
            return floor;
        }
        int res=0;
        int trials = Integer.MAX_VALUE;

        for (int k = 1; k <=floor ; k++) {
            res = Math.max(eggdrop(eggs-1,k-1),
                    eggdrop(eggs,floor-k)+1);

            if(res<trials)
            {
                trials=res;
            }
        }
    return trials;
    }
}
