package com.company.Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Problem6and7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = obj.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Enter the "+i+" element of array");
            arr[i]=arr1[i]= obj.nextInt();

        }
        System.out.println("Enter array to check it is inverse of first or not");
        for (int i = 0; i <arr.length ; i++) {
            arr2[i] = obj.nextInt();

        }

        arrainverse(arr,arr1);
        System.out.println(Arrays.toString(arr1));
        checkinverse(arr1,arr2);

    }

    public static void arrainverse(int[] arr,int arr1[]) {
        int place = 1;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[arr.length-i-1];
            int inv = (int) (place*Math.pow(10,value-1));
            int count = 0;
            int rem =0;
            while (inv>0){
                rem = inv%10;
                inv = inv/10;
                count = count+1;
            }
            arr1[arr1.length-count] = rem;
            place = place+1;

        }

    }

    public static void checkinverse(int arr2[],int arr1[]) {
        System.out.println(arr1==arr2);
        }


}
