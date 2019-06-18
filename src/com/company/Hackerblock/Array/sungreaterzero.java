package com.company.Hackerblock.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class sungreaterzero {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
//        int N = s.nextInt();
//        int ar[] = new int[N];
//        for (int i = 0; i < N; i++) {
//            ar[i] = s.nextInt();
//        }

            ArrayList <Integer> arr = new ArrayList<>();
            while (s.hasNextInt()){
                arr.add(s.nextInt());
            }
            sumtollpos(arr);
        sumtollpos(arr);
    }

    public static void sumtollpos(ArrayList arr) {
        int sum = 0;
        int n = arr.size();
        int i = 0;
        while (i < n) {
            sum = sum + (int) arr.get(i);

            if (sum < 0) {
                System.exit(1);
            }
            System.out.println(arr.get(i));
            i = i + 1;

        }

    }

    public static void sumtollpos1(int[] ar) {
        int sum = 0;
        int n = ar.length;
        int i = 0;
        while (i < n) {
            sum = sum + ar[i];

            if (sum < 0) {
                System.exit(1);
            }
            System.out.println(ar[i]);
            i = i + 1;


        }
    }
}