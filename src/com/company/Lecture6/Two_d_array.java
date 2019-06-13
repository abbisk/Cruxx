package com.company.Lecture6;

import java.util.Scanner;

public class Two_d_array {
    public static void main(String[] args) {
//        Scanner obj = new Scanner();

        int arr[][] = new int[2][3];

        int ar1[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[i].length; j++) {
                System.out.print(ar1[i][j]);
            }
            System.out.println();


        }
        hwaveprint(ar1);
    }

    public static void hwaveprint(int ar1[][]) {
        for (int i = 0; i < ar1.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < ar1[i].length; j++) {
                    System.out.print(ar1[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int j=ar1[i].length - 1;j > 0;j--){
                    System.out.print(ar1[i][j] + " ");

                }
                System.out.println();
            }
        }

    }

}

