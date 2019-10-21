package com.company.Lecture7;

public class Recursion {
    public static void main(String[] args) {
//        p4();
        int i =5;
        int j =5;
        int k = 1;
//        printinc(1);
        printdec(5);
//        printincdec(5);
//        System.out.println(fibonecci(5));
    }

    public static void p4() {
        System.out.println("4");
        p3();
        System.out.println("4 se jaa raha hu");
    }


    public static void p3() {
        System.out.println("3");
        p2();
        System.out.println("3 se jaa raha hu");
    }

    public static void p2() {
        System.out.println("2");
        p1();
        System.out.println("2 se jaa raha hu");
    }

    public static void p1() {
        System.out.println("1");
        p0();
        System.out.println("1 se jaa raha hu");
    }
    public static void p0() {
    }

    public static void printinc(int k) {
        if (k == 5) {
            System.out.println(k);
            return;

        }
        System.out.println(k);
        printinc(k + 1);

    }

    public static void printinc1(int i) {
        if (i == 0) {
            return;

        }
        printdec(i - 1);
        System.out.println(i);
    }
    public static void printdec(int i) {
        if (i == 0) {
            return;

        }
        System.out.println(i);
        printdec(i-1);
    }

    public static void printincdec(int i) {
        if (i == 0) {
            return;

        }
        System.out.print(i+" ");
        printincdec(i - 1);
        System.out.print(i);


    }

    public static int factorial(int i) {
        if(i==0){
            return 1;
        }

        return i* factorial(i-1);
    }

    public static int fibonecci(int i) {
        if(i<2){
            return i;
        }

        return fibonecci(i-1)+fibonecci(i-2);
    }
}
