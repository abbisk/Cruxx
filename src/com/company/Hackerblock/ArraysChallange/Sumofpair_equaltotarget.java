package com.company.Hackerblock.ArraysChallange;

import java.util.Scanner;

public class Sumofpair_equaltotarget {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N+1];
        int i = 0;
        while (i<N){
            arr[i] = s.nextInt();
            i = i+1;
        }
        int target = s.nextInt();
        i =0;
        while (i<N){
            int first = arr[i];
            int j = i+1;
            if(arr[i]!=arr[j]){
                while (j<N){
                    int second = arr[j];
                    if(first+second == target){
                        System.out.println(arr[i]+" and "+arr[j]);
                    }
                    j = j+1;
                }
            }
            i = i+1;
        }
    }
}
