package com.company.Assignment3;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter N1 for lcm");
        int N1 = obj.nextInt();
        System.out.println("Enter N2 for lcm");
        int N2 = obj.nextInt();
        lcm(N1,N2);
    }

    public static void lcm(int N1, int N2) {
        int lcm = (N1 > N2) ? N1 : N2;

        // Always true
        while(true)
        {
            if( lcm % N1 == 0 && lcm % N2 == 0 )
            {
                System.out.printf("The LCM of %d and %d is %d.", N1, N2, lcm);
                break;
            }
            ++lcm;
        }
    }
}


