package com.company.Hackerblock.Array;

import java.util.Scanner;

public class swastik_pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = row;
        if(row>=5 && row%2!=0){
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    // checking if i < row/2
                    if (i < row / 2) {

                        // checking if j<col/2
                        if (j < col / 2) {

                            // print '*' if j=0
                            if (j == 0)
                                System.out.print("*");

                                // else print space
                            else
                                System.out.print(" " + " ");
                        }

                        // check if j=col/2
                        else if (j == col / 2)
                            System.out.print(" *");

                        else {
                            // if i=0 then first row
                            // will have '*'
                            if (i == 0)
                                System.out.print(" *");
                        }
                    } else if (i == row / 2)
                        System.out.print("* ");
                    else {

                        // middle column and last column
                        // will have '*' after i > row/2
                        if (j == col / 2 || j == col - 1)
                            System.out.print("* ");

                            // last row
                        else if (i == row - 1) {

                            // last row will be have '*' if
                            // j <= col/2 or if it is last column
                            if (j <= col / 2 || j == col - 1)
                                System.out.print("* ");
                            else
                                System.out.print(" " + " ");
                        } else
                            System.out.print(" " + " ");
                    }
                }
                System.out.print("\n");
            }

        }
    }
}
