package com.company.Hackerblock.Array;

import java.util.Scanner;

public class pattern_triangle {
    public static void main(String[] args) {
    int i,j,n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of lines");
    n=sc.nextInt();
    int c = n;
     for(i=1;i<=n;i++)
    {

        for(j=c-i;j<=n-i;j++)
        {
            System.out.printf("  ");
        }
        for(j=i;j>0;j--)
        {
            System.out.printf(" %d",j);
        }
        for(j=2;j<=i;j++)
        {
            System.out.printf(" %d",j);
        }

        System.out.println();
    }
}
}
