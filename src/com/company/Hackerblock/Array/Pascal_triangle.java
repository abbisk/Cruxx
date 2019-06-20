package com.company.Hackerblock.Array;

import java.util.Scanner;

public class Pascal_triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i <n ; i++) {
            int num =1;
            for (int j = 0; j <=i ; j++) {
                System.out.print(num);
                num = num*(i-j)/(j+1);

            }
            System.out.println();
        }
    }
}
