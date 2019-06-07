package com.company.Assignment2;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to get Fibonecci");
        String ip = obj.nextLine();
        int num = Integer.parseInt(ip);
        while (num>0){
            int t= a+b;
            a = b;
            b = t;
            num -= 1;
            System.out.println(a);
            }
    }



}
