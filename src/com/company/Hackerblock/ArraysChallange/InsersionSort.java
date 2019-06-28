package com.company.Hackerblock.ArraysChallange;

import com.company.Lecture5.ArrayIntro;

import java.util.Scanner;

public class InsersionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        insersion(arr);
        display(arr);
    }
    public static void insersion(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    ArrayIntro.swap(nums, j, j - 1);
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
