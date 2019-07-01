package com.company.Patterns;

import java.util.Scanner;

public class hollowdiamond2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        String j = "*";
        String k = " ";
        int i =0;
        int l =1;
        while (i<row) {
            if(i<=row/2) {
                System.out.println(j.repeat(l+1) + k.repeat(2 * i + 1) + j.repeat(row / 2 - i));
            }
            else if(i>row/2){
                System.out.println(j.repeat(i-row/2) + k.repeat(row-2*l) + j.repeat(i-row / 2));
                l++;
            }
            i++;
        }
    }
}
