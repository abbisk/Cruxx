package com.company.Lecture4;

import java.util.Scanner;

public class any2decimal_conversio {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENter binary");
        int any = obj.nextInt();
        int base = obj.nextInt();
        System.out.println(any2deci(any,base));
    }

    public static int any2deci(int any,int base) {
        int deci =0;
        int place = 1;
        while (any>0){
            int rem  = any%10;
            any = any/10;
            deci = deci+rem*place;
            place = place*base;

        }
        return deci;

    }
}
