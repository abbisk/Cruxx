package com.company.Hackerblock.Recursion;

public class apowern {
    public static void main(String[] args) {
        System.out.println(power(2,4));
    }

    public static int power(int a , int n) {
        if (n==0){
            return 1;
        }
        return a* power(a,n-1);
    }
}
