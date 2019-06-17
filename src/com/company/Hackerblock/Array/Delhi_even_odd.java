package com.company.Hackerblock.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Delhi_even_odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        while (s.hasNextInt()){
            arr.add(s.nextInt());
        }
        evenodd(arr);
    }

    public static void evenodd(ArrayList arr) {
        int n = arr.size();
        int i =0;

        while (i<n){
            int sum = 0;
            int num = (int) arr.get(i);
            while (num>0){
                int rem = num%10;
                num = num/10;
                sum = sum+rem;

            }
                if (sum % 2 == 0 && sum % 4 == 0) {
                    System.out.println("Yes");
                } else if (sum % 2 != 0 && sum % 3 == 0) {

                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            i = i+
                    1;

        }

    }
}
