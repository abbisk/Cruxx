package com.company.Assignment2;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter rows");
        String ip = obj.nextLine();
        int num = Integer.parseInt(ip);
        int i= 1;
        while (i <= num){
            int column = 1;
            int c = i;
            while(column<= i){
                System.out.print(c+" ");
                c= c+1;
                column = column+1;

            }
            System.out.println(" ");
            i = i+1;


        }
    }
}
