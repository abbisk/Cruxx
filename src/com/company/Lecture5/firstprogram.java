package com.company.Lecture5;

import java.util.Scanner;

public class firstprogram {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[5];
        int ar1[] = {1,2,3,4,5};

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = obj.nextInt();

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }


    }
}
