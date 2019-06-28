package com.company.Hackerblock.String;

import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Character c = obj.next().charAt(0);
        if (c >= 'a' && c <= 'z') {
            System.out.println("lowercase");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("UPPERCASE");
        } else {
            System.out.println("Invalid");

        }
    }
}
