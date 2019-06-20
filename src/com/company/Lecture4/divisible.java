package com.company.Lecture4;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number");
        int num = obj.nextInt();
        int countof = obj.nextInt();
        System.out.println(countof5(num,countof));
    }

    public static int countof5(int num,int countof) {
        int count = 0;
        while (num>0){
            int rem = num%5;
            if (rem==countof){
                count = count+1;
            }
            num = num/10;
        }
        return count;

    }
}
