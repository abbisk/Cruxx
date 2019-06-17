package com.company.Assignment6;

public class Problem1 {
    public static void main(String[] args) {
        int n = 5;

        ///////////////Function call
//        eventhenodd(n);
//        problem2(n);
        problem3(n);
        problem4(n);
    }

    public static void eventhenodd(int n) {
        if(n==0){
            return;
        }
        if(n%2==1){
            System.out.println(n);
        }
        eventhenodd(n-1);
        if (n%2==0){
            System.out.println(n);
        }

    }

    public static void problem2(int n) {
        if(n==0){
            return;
        }
        problem2(n-1);
        while (n>0){
            System.out.print("*");
            n= n-1;
        }
        System.out.println();

    }

    public static void problem3(int n) {
        if(n==0){
            return;
        }
        int j = n;
        while (j>0){
            System.out.print("*");
            j= j-1;
        }
        System.out.println();
        problem3(n-1);

    }
    public static void problem4(int n) {
        if(n==0){
            return;
        }
        problem4(n-1);
        while (n>0.){
            System.out.println((int)Math.pow(11,n));
            n= n-1;
        }
        System.out.println();

    }

}
