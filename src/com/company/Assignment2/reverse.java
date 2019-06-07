package com.company.Assignment2;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter rows");
        int number = obj.nextInt();
        int rev =0;
        int rem = 0;
        while (number>0){
            rem = number%10;
            rev = rev*10+rem;
            number =number/10;
            if(number==0) {
                System.out.print(rev);
            }
        }
    }
}
