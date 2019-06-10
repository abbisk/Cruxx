//package com.company.Lecture4;
//
//import java.util.Scanner;
//
//public class Decimal2binary_conversio {
//    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        System.out.println("ENter binary");
//        int decimal = obj.nextInt();
//        System.out.println(binaty2deci(decimal));
//    }
//
//    public static int binaty2deci(int decimal) {
//        int binary = 0;
//        int place = 1;
//        while (decimal > 0) {
//            int rem = decimal % 2;
//            decimal = decimal / 2;
//            binary = binary + rem * place;
//            place = place * 10;
//
//        }
//        return binary;
//
//    }
//
//    public static int any2deci(int any, int base) {
//        int deci = 0;
//        int place = 1;
//        while (any > 0) {
//            int rem = any % 10;
//            any = any / 10;
//            deci = deci + rem * place;
//            place = place * base;
//
//        }
//        return deci;
//    }
//
//
//    public static int any2bin(int any, int base) {
//        int binary = 0;
//        int place = 1;
//        while (any > 0) {
//            int rem = any % base;
//            any = any / base;
//            binary = binary + rem * place;
//            place = place * base;
//
//
//        }
//        return binary;
//    }
//
//    public static int any2any(int any, int fbase, int sbase) {
//        int deci = any2deci(any, fbase);
//        return binaty2deci(any, sbase);
//
//    }
//}
//
