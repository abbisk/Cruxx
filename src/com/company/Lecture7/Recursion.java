//package com.company.Lecture7;
//
//public class Recursion {
//    public static void main(String[] args) {
////        p4();
//        int i = 5;
////        printinc(5);
////        printdec(5);
////        printincdec(5);
//        System.out.println(fibonecci(5));
//    }
//
//    public static void p4() {
//        System.out.println("4");
//        p3();
//        System.out.println("4 se jaa raha hu");
//    }
//
//
//    public static void p3() {
//        System.out.println("3");
//        p2();
//        System.out.println("3 se jaa raha hu");
//    }
//
//    public static void p2() {
//        System.out.println("2");
//        p1();
//        System.out.println("2 se jaa raha hu");
//    }
//
//    public static void p1() {
//        System.out.println("1");
//        System.out.println("1 se jaa raha hu");
//    }
//
//    public static void printinc(int i) {
//        if (i == 0) {
//            return;
//
//        }
//        printinc(i - 1);
//        System.out.println(i);
//
//    }
//
//    public static void printdec(int i) {
//        if (i == 0) {
//            return;
//
//        }
//        printdec(i - 1);
//        System.out.println(i);
//    }
//
//    public static void printincdec(int i) {
//        if (i == 0) {
//            return;
//
//        }
//        System.out.print(i+" ");
//        printincdec(i - 1);
//        System.out.print(i);
//
//
//    }
//
//    public static int facrorial(int i) {
//        if(i==0){
//            return 1;
//        }
//
//        return i* facrorial(i-1);
//    }
//
//    public static int fibonecci(int i) {
//        if(i<2){
//            return i;
//        }
//
//        return fibonecci(i-1)+fibonecci(i-2);
//    }
//}
