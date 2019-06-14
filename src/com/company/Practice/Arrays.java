package com.company.Practice;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[2];
        for (int i = 0; i <2 ; i++) {
            arr[i] = obj.nextInt();
        }
        for (int i = 0; i <2 ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
