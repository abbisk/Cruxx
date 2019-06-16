package com.company.Assignment2;

public class patternlikequestion8 {
    public static void main(String[] args) {
        int n = 6;
        int row = 1;

        while (row<=n) {
            int col = 1;
            while (col <= row) {
                if (row > n-3) {

                    if (col == 1 || row == col) {

                        System.out.print(row-1 + " ");

                    } else {
                        System.out.print("0 ");

                    }
                    col = col+1;

                }
                else if(row<=n-3){
                    System.out.print(1+" ");
                    col = col+1;}
                }
                row = row + 1;

                System.out.println();

            }
        }

    }

