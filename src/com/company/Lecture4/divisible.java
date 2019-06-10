package com.company.Lecture4;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number");
        int num = obj.nextInt();
        System.out.println(countof5(num));
    }

    public static int countof5(int num) {
        int count = 0;
        while (num>0){
            int rem = num%5;
            if (num%5==0){
                count = count+1;
            }
            num = num/10;
        }
        return count;

    }
}
