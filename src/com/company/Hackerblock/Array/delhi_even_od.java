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
        int i =0;

        while (i<=n){
            int num = s.nextInt();
            int sum = 0;
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
