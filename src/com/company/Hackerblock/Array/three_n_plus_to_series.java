package com.company.Hackerblock.Array;

import java.util.Scanner;

public class three_n_plus_to_series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N1 = s.nextInt();
        int N2 = s.nextInt();
        int i = 1;
        while (i<=N1){
            int sum = (3*i)+2;
            if(sum%N2!=0){
            System.out.println(sum);
            }
            if(sum%N2==0){
                N1 = N1+1;
            }
            i = i+1;
        }

    }
}
