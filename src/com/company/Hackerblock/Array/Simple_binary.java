package com.company.Hackerblock.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Simple_binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (s.hasNextFloat()){
            arr.add(s.nextInt());
        }
        sumtollpos(arr);

    }

    public static void sumtollpos(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();
        int i =0;
        while(i<=n){
            sum = sum+ arr.get(i);

            if(sum<0){
                System.exit(1);
            }
            System.out.println(arr.get(i));
            i= i+1;

        }

    }

}