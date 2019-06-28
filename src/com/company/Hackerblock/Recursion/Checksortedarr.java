package com.company.Hackerblock.Recursion;

import java.util.Scanner;

public class Checksortedarr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i <N ; i++) {
            if(s.hasNextInt()){
                arr[i]=s.nextInt();
            }
        }
        int index = 0;
        System.out.println(sort(arr,index));
    }

    public static boolean sort(int arr[], int index) {
        if(arr.length-1==index){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return sort(arr,index+1);
    }
}
