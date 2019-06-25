package com.company.Practice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Arrays {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(takeinput()));

    }

    public static int[] takeinput() {
        System.out.println("Enter the length of array");
        int length = s.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = s.nextInt();

        }
        return arr;
    }

    public static void main() {

    }
}