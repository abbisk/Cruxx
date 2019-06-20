package com.company.Hackerblock.Array;

import java.util.Scanner;

public class Rhombus_pattern {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int row= s.nextInt();
            int n = row;

            while (row>0) {
                int col = row;
                while (col>0) {
                    if(col>0){
                        System.out.print(" ");}
                    else {
                        System.out.print("*");
                    }
                    if(row==n || row==1 && col>row-1){
                        System.out.print("*");
                    }
                    col = col-1;
                }
                System.out.print("*");
                row = row - 1;

                System.out.println();

            }
        }

    }
