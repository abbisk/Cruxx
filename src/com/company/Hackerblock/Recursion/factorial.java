package com.company.Hackerblock.Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(factt(n));
    }

    public static int  factt(int n) {
        if(n<2){
            return 1;
        }
        return n*factt(n-1);
    }
}
