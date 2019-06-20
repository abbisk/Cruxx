package com.company.Assignment2;

import java.util.Scanner;
public class problem10{
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to get Fibonecci");
        int num = obj.nextInt();
        int i=1;
        while (i<=num){
            int c = 1;
            while (c<=i){
                System.out.print(a+" ");
                int t= a+b;
                a = b;
                b = t;
                c= c+1;
            }
            System.out.println("\n");
            i = i+1;
        }
    }



}
