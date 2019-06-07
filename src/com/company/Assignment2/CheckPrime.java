package com.company.Assignment2;

import com.sun.jdi.request.MethodExitRequest;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number to check prime");
        String ip = obj.nextLine();
        int num = Integer.parseInt(ip);
        int c = 2;
        while ((c*c) <=num){
            if (num%c==0){
                System.out.println("Number is not prime");
                System.exit(1);
            }
            c= c+1;

        }
        System.out.println("Prime");
    }
}
