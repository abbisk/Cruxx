package com.company.Assignment2;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter rows");
        String ip = obj.nextLine();
        int num = Integer.parseInt(ip);
        int base = 11;
        long result = 1;
        int a = num;
        while (num !=0) {
            if (num == a) {
                System.out.println("1");
            }
            result *= base;
            num = num - 1;
            System.out.println(result);
        }

    }
}
