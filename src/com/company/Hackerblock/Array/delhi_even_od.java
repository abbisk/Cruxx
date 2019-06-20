package com.company.Hackerblock.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class delhi_even_od {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        evenodd(s);

    }
    public static void evenodd(Scanner s) {
        int n = s.nextInt();

        while (n>0){
            int num = s.nextInt();
            int sumeven = 0;
            int sumodd = 0;
            while (num>0){
                int rem = num%10;
                num = num/10;

                if (rem %2 ==0){
                    sumeven = sumeven+rem;
                }
                else {
                    sumodd = sumodd+rem;
                }

            }
            if (sumeven % 4 == 0 || sumodd % 3==0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            n = n-1;

        }

    }
}
