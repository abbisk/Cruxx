package com.company.Assignment3;

import java.util.Scanner;

public class xpowern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Any to deci conversion enter any");
        int x = obj.nextInt(); // Take input to the system inside variable any
        System.out.println("Any to deci Enter base");
        int n = obj.nextInt(); // Take input to the system inside variable base

        int a= xpowern(x,n);
        System.out.println(a);
    }

    public static int xpowern(int x, int n) {
        int p = 1;
        while(n>0){

        p = p*x;
        n=n-1;
    }
        return p;
    }
}
