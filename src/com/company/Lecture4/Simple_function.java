/*
Temperature to farenhite conversion using functions taking parameter using scanner
 */
package com.company.Lecture4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Simple_function {
    public static void main(String[] args) {


//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter Start, End and Step");
//        int start = obj.nextInt();
//        int end = obj.nextInt();
//        int step = obj.nextInt();
//        tempconversion(start,end,step);
        int first = 20;
        int second = 10;
        swap(first,second);

    }

//    public static void tempconversion(int start,int end,int step) {
//
//        while (start <= end) {
//            int c = (int) ((5f / 9) * (start - 32));
//            System.out.println(c);
//            start = start + step;
//
//
//        }
//    }

    public static void swap(int first,int second) {
        int a = first;
        first = second;
        second = a;
        System.out.println("Swaped values "+first +" "+second);

    }
}

