package com.hackerblocks;

import java.util.Scanner;

public class PythogrusTriplet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pythagorean(n);

    }
    public static void pythagorean(int n)
    {
    double square;
    float num1;
    float num2;
    int num_1;
    int num_2;
        if(n%2==0)
        {
            square= (n/2)*(n/2);
            num1=(float) square-1;
            num2=(float) square+1;
            num_1=(int) num1;
            num_2=(int) num2;

        }
        else
        {
             square = n*n;
             num1= (float) ((square/2)-0.5);
             num2= (float) ((square/2)+0.5);
             num_1=(int)num1;
             num_2=(int)num2;

        }
        double total_lhs= num_2*num_2;
        double total_rhs= (n*n)+(num_1*num_1);
        if(total_lhs==total_rhs) {
            System.out.println(num_1 + " " + num_2);
        }
        else
            System.out.println("-1");
    }
}
