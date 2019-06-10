package com.company.Lecture4;

import java.util.Scanner;

public class inverse_of_number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number");
        int num = obj.nextInt();
        System.out.println(num);
        System.out.println("Inverse "+inverse(num));
    }

    public static int inverse(int num) {
        int rem =0;
        int place =1;
        int inv =0;
        while(num>0){
            int value = num%10;
            num = num/10;
            inv = (int) (inv+place*Math.pow(10,value-1));
            place = place+1;


        }
        return inv;

    }
}
