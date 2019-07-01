package com.company.Patterns;

import java.util.Scanner;

public class Patternmirror {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int i = 1;
        while (i<=(2*row)-1){
            int j = 0;
            if(i<=row){
                j = i;
            }
            else {
                j = (2*row)-i;
            }
            while (j>0){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
