package com.company.Hackerblock.Array;

import java.util.Scanner;

public class sungreaterzero {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i <N ; i++) {
                arr[i] = s.nextInt();
            }
            sumtollpos(arr);
        }

        public static void sumtollpos(int arr[]) {
            int sum = 0;
            int n = arr.length-1;
            while(n>0){
                sum = sum+arr[arr.length-n-1];

                if(sum<0){
                    System.exit(1);
                }
                System.out.println(arr[arr.length-n-1]);
                n= n-1;

            }

        }

    }