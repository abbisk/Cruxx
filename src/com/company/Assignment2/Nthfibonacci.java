package com.company.Assignment2;

import java.util.Scanner;
public class Nthfibonacci {
    public static void main(String[] args) {

        int f = 0;
        int s = 1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to get fiboneci");
        String ip = obj.nextLine();
        int num = Integer.parseInt(ip);
        while (num>0){
            int t= f+s;
            f = s;
            s = t;
            num -= 1;

        }

        System.out.println(f);

    }
}
