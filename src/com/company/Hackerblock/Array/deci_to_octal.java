package com.company.Hackerblock.Array;

import java.util.Scanner;

public class deci_to_octal {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter decimal number to convert in octal");
        int deci = s.nextInt();
        int octal = 0;
        int place = 1;
        while(deci>0){
            int rem = deci%8;
            deci = deci/8;
            octal = octal+place*rem;
            place = place*10;
        }
        System.out.println("\n"+"Octal value: "+octal);

    }
    }
