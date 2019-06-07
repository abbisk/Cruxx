package com.company.Assignment2;

import com.sun.jdi.request.MethodExitRequest;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number to check prime");
        String ip = obj.nextLine();
        int num = Integer.parseInt(ip);
        boolean breakloop = false;
        int c = 2;
        while (c <=num){
            while ((c*c)<=num) {
                if (num % 2 == 0) {

                    breakloop = true;
                }
            }
            c= c+1;
            System.out.print(c+" ");

        }
    }
}
