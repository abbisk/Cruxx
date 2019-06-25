package com.company.Hackerblock.ArraysChallange;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i]=s.nextInt();
        }
        selection(arr);
        display(arr);

    }
    public static void selection(int arr[]){
        for (int i = 0; i <arr.length ; i++) {

            int max = maxindex(arr, 0, arr.length - i - 1);
            swap(arr, max, arr.length -i- 1);

        }
    }
    public static int maxindex(int arr[],int start,int end){
        int max=0;
        for (int i = start; i <=end; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int first, int second){ // Function to swap array to elements
        int t = arr[first];
        arr[first] = arr[second];
        arr[second]=t;
    }

    public static void display(int arr[]) {
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}
