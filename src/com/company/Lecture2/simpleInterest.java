package com.company.Lecture2;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        int ammount = 100;
        int rate = 10;
        int time = 2;
        int interest = (ammount*rate*time)/100;
        int total = ammount+interest;
        System.out.println("Total Interest: = "+interest);
        System.out.println("Total: = "+total);
    }

}
