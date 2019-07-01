package com.company.Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int i = 0;
        while (i<row){
            int j = row;
            int k =0;
            while (k<j){
                if(i>0 && k<i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
                k++;
            }
            System.out.println();
            i++;
        }

    }
}
