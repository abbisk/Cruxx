package com.company.Hackerblock.Array;

import java.util.Scanner;

public class binary_to_deci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i] = s.nextInt();

        }
        bintodeci(arr);
    }

    public static void bintodeci(int arr[]) {
        int n = arr.length - 1;
        while (n >= 0) {
            int deci = 0;
            int place = 1;
            int binary = arr[arr.length-n-1];
            while (binary > 0) {
                ;
                int rem = binary % 10;
                binary = binary / 10;
                deci = deci + rem * place;
                place = place * 2;
                if (binary == 0) {
                    System.out.println(deci);
                }

            }
            n= n-1;

        }
    }
}