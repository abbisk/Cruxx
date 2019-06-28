package com.company.Hackerblock.Recursion;

public class nth_fibonecci {
    public static void main(String[] args) {
        System.out.println(fibo(7));

    }

    public static int fibo(int n) {
        if(n == 1 || n ==0){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
