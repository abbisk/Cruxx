package com.company.Hackerblock.ArraysChallange;

import java.util.Arrays;
import java.util.Scanner;

public class countingSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            if(s.hasNextInt()){
                arr[i] = s.nextInt();
            }
        }
        countSort(arr);
        printArray(arr);
    }
    static void countSort(int[] arr)
    {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            count[arr[i] - min]++;
        }

        for (int i = 1; i < count.length; i++)
        {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--)
        {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = output[i];
        }
    }

    static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
