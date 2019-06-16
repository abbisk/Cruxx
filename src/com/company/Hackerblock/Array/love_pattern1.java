package com.company.Hackerblock.Array;

import java.util.Scanner;

public class love_pattern1 {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            int row = 1;

            while (row<=N) {
                int col = 1;
                while (col <= row) {
                    if (row >3) {
                        if(row%2!=0){
                            System.out.print(1);
                        }
                        else {
                            if (col == 1 || row == col) {

                                System.out.print(1);

                            } else {
                                System.out.print("0");

                            }

                        }

                    col = col+1;}
                    else if(row<=3){
                        System.out.print(1);
                        col = col+1;}
                }
                row = row + 1;

                System.out.println();

            }
        }

    }
