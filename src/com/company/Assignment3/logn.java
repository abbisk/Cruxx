package com.company.Assignment3;

import java.util.Scanner;

public class logn {
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
        int b;
        b = (int) Math.log(x);
        int h = (int) Math.log(n);
        int ans = b/h;

        return ans;
    }
}
