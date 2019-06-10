package com.company.Assignment3;

import java.util.Scanner;

public class number_conversion {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);  // Scanner object

        System.out.println("Enter binary to convert that in decimal number");
        int binary = obj.nextInt(); // Take input to the system inside variable binary

        System.out.println("Enter decimal number to convert that in binary");
        int deci = obj.nextInt(); // Take input to the system inside variable deci

        System.out.println("Any to deci conversion enter any");
        int any = obj.nextInt(); // Take input to the system inside variable any
        System.out.println("Any to deci Enter base");
        int base = obj.nextInt(); // Take input to the system inside variable base

        System.out.println("Any to binary conversion enter any");
        int any1 = obj.nextInt(); // Take input to the system inside variable any
        System.out.println("Any to  binary Enter base");
        int base1 = obj.nextInt(); // Take input to the system inside variable base

        System.out.println("Binary to deci ans:  "+bin2deci(binary));
        System.out.println("Deci to binary ans:  "+deci2bin(deci));
        System.out.println("Any to deci ans:  "+any2deci(any,base));
        System.out.println("Any to binary ans:  "+any2binary(any1,base1));

    }

    public static int bin2deci(int binary) {
        int deci = 0;
        int place = 1;
        while (binary>0){
            int rem = binary%10;
            binary = binary/10;
            deci = deci+rem*place;
            place = place*2;
        }
        return deci;

    }

    public static int deci2bin(int deci) {
        int binary =0;
        int place = 1;
        while (deci>0){
            int rem = deci%2;
            deci = deci/2;
            binary = binary+rem*place;
            place = place*10;

        }
        return binary;

    }

    public static int any2deci(int any,int base) {
        int deci =0;
        int place=1;
        while (any>0){
            int rem = any%10;
            any = any/10;
            deci = deci+rem*place;
            place = place*base;
        }
        return deci;

    }
    public static int any2binary(int any1, int base1) {
        int binary =0;
        int place = 1;
        while(any1>0){
            int rem = any1%2;
            any1 = any1/2;
            binary = binary+rem*place;
            place = place*base1;

        }
        return binary;

    }
}
