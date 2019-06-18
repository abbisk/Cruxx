package com.company.Hackerblock.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class sungreaterzero1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        pos(s);

    }

    public static void pos(Scanner s) {
        int sum = 0;
        while (sum >= 0) {
            int num = s.nextInt();
            int j = num;
            sum = sum + num;
            if(sum>0){
            System.out.println(num);}

            }
    }
}