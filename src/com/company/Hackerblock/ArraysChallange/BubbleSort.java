package com.company.Hackerblock.ArraysChallange;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        bubblesort(arr);
        display(arr);
    }

    public static void bubblesort(int arr[]) {
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void display(int arr[]) {
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}
