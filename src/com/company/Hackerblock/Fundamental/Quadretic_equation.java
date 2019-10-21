package com.company.Hackerblock.Fundamental;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.StrictMath.sqrt;

class Quadratic_equation {
    public static void main(String[] args) {

        Quadratic_equation obj = new Quadratic_equation();
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        obj.findroot(a,b,c);




    }
    public void findroot(int a , int b, int c){
        if (a==0){
            System.out.println("Invalid");
            return;
        }
        int d = b*b - 4*a*c;
        double sqrt_val = sqrt(abs(d));

        if(d>0){
            System.out.println("Roots are real and different \n");
            System.out.println((double)(-b + sqrt_val) / (2 * a) + "\n"
                    + (double)(-b - sqrt_val) / (2 * a));

        }
        else{
            System.out.println("Roots are complex \n");
            System.out.println( -(double)b / ( 2 * a ) + " + i"
                    + sqrt_val + "\n"  + -(double)b / ( 2 * a )
                    + " - i" + sqrt_val);

        }
    }
}
