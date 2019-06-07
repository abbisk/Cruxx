package com.company.Assignment2;

import java.util.Scanner;
public class problem10{
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to get Fibonecci");
        String ip = obj.nextLine();
        int num = Integer.parseInt(ip);
        int i=1;
        while (i<=num){
            int c = 2;
            while (c<=i+2){
                int t= a+b;
                a = b;
                b = t;
                System.out.print(a+" ");
                c= c+1;
            }
            System.out.println("\n");
            i = i+1;
        }
    }



}
