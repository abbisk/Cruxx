package com.company.Hackerblock.ArraysChallange;

import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i]= s.nextInt();
        }
        int M = s.nextInt();
        int ans = binarysearch(arr,M);
        System.out.println(ans);
    }

    public static int binarysearch(int arr[],int M) {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==M){
                return i;
            }

        }
        return -1;
    }
}
