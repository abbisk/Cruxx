package com.company.Hackerblock.ArraysChallange;

import java.util.Arrays;
import java.util.Scanner;

public class GameSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int N = s.nextInt();
        String[] arr = new String[N+1];
        int i = 0;
        while (i<N){
            Scanner s1 = new Scanner(System.in);
            arr[i] = s1.nextLine();
            i++;
        }
        Arrays.sort(arr);
        for (int j = 0; j <N ; j++) {
            System.out.println(arr[j]);
        }
    }
}
