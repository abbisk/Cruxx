package com.company.Hackerblock.Array;

import java.util.Scanner;

public class hollow_diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");

        // Print i number of stars
        for (int i=1; i<=rows; i++)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print("*");
            }
            for (int k = 1; k <= i*2-2; k++)
            {
                System.out.print(" ");
            }
            for (int l = i; l <= rows; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int k = i*2-2; k < rows*2-2; k++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        scanner.close();
    }
}
