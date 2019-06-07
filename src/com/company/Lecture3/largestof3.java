package com.company.Lecture3;

import java.util.Scanner;

public class largestof3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number");
        String ip = obj.nextLine();
        String jp = obj.nextLine();
        String tp = obj.nextLine();
        int a = Integer.parseInt(ip);
        int b = Integer.parseInt(jp);
        int c = Integer.parseInt(tp);
        if (a>b&&a>c){
            System.out.println("a is greater");
        }
        else if(b>c&&b>c){
            System.out.println("b is greater");
        }
        else {
            System.out.println("c is greater");
        }
    }
}
