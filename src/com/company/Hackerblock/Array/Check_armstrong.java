package com.company.Hackerblock.Array;

import java.util.Scanner;

public class Check_armstrong {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to check Armstrong");
        int num = obj.nextInt();
        System.out.println(armstrong(num));

    }

    public static boolean armstrong(int num) {
        int armstrong = 0;
        int a = num;
        int b = num;
        int digit = 0;
        while (num>0) {
            int rem = num % 10;
            num = num / 10;
            digit = digit + 1;
        }
        while (b>0){

            int rem1 = b%10;
            b = b/10;
            armstrong = (int) (armstrong+Math.pow(rem1,digit));
        }

        if (a == armstrong){
            return true;
        }

        return false;
    }
    }
