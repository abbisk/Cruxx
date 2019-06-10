package com.company.Lecture4;

import java.util.Scanner;

public class Binary2decimal_conversio {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENter binary");
        int binary = obj.nextInt();
        System.out.println(binaty2deci(binary));
    }

    public static int binaty2deci(int binary) {
        int deci =0;
        int place = 1;
        while (binary>0){
            int rem  = binary%10;
            binary = binary/10;
            deci = deci+rem*place;
            place = place*2;

        }
        return deci;

    }
}
