package com.hackerblocks;

import java.util.Scanner;

public class Quadratic_Equation {
    public static void main(String[] args) {
        double a, b, c;
        double root1, root2, imaginary, discriminant;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        discriminant = (b * b) - (4 * a *c);

        if(discriminant > 0)
        {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant))/ (2 * a);
            int r1=(int)root1;
            int r2=(int)root2;
            System.out.println("Real and Distinct");
            if(r1<r2)
            {
                System.out.print(r1);
                System.out.print(" "+r2);
            }
            else {
                System.out.print(r2);
                System.out.print(" "+r1);
            }
        }
        //else if(discriminant == 0)
        //{
            //root1 = root2 = -b / (2 * a);
            //int r1=(int)root1;
            //System.out.println("Equal and Real" +"\n"+ r1 + " "+ r1);
       // }
        else
        {

            System.out.println("Imaginary");

        }
    }
}
