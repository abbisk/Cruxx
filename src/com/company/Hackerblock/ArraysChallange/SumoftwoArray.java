package com.company.Hackerblock.ArraysChallange;

import java.util.Arrays;
import java.util.Scanner;

public class SumoftwoArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            if(s.hasNextInt()){
                arr[i] = s.nextInt();
            }
        }
        int M = s.nextInt();
        int arr1[] = new int[M];
        for (int i = 0; i < M; i++) {
            if(s.hasNextInt()){
                arr1[i] = s.nextInt();
            }
        }

        int max = Math.max(N,M);
        int i = 0;
        while (i<max){
            if(i<max-1){
                System.out.print(arr[i]+arr1[i]+" ");
            }
            else {
                System.out.println("END");
            }
            i++;
        }
    }

}
