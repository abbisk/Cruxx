package com.company.Hackerblock.ArraysChallange;

import java.util.ArrayList;
import java.util.Scanner;

public class Pm_visit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        pmvisit(s,N);

    }

    public static void pmvisit(Scanner s,int N) {
        int total = 0;
        while (N>0){
            ArrayList <Integer> ar = new ArrayList<>();
            while (s.hasNextInt()){
                ar.add(s.nextInt());
            }
            int first = ar.get(0);
            int second = ar.get(1);
            while (first<second){
                int n = 2;
                while (first<second){
                    int count = 0;
                    if(count<3){
                        if(first%n==0){
                            count= count+1;
                        }

                }
                    if(count==2){
                        total = total+1;
                    }
                    first = first+1;
                }
                n= n+1;
                first = first+1;
            }
            N = N+1;
        }
        System.out.println(total);

    }
}
