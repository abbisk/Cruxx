package com.company.Assignment3;

import java.util.Scanner;

public class armstrong_number<a> {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to check Armstrong");
        int num = obj.nextInt();
        System.out.println("Starting range starting N1 to print Armstrong numbers");
        int N1 = obj.nextInt();
        System.out.println("Starting range starting N2 to print Armstrong numbers");
        int N2 = obj.nextInt();
        System.out.println("---------Output------");
        armstrong(num);
        armstronglist(N1,N2);

    }

    public static void armstrong(int num) {
        int armstrong = 0;
        int a = num;
        int b = num;
        int digit = 0;
        while (num>0) {
            int rem = num % 10;
            num = num / 10;
            digit = digit + 1;
        }
        while (b>0){

            int rem1 = b%10;
            b = b/10;
            armstrong = (int) (armstrong+Math.pow(rem1,digit));
            }

        if (a == armstrong){
            System.out.println("True\n");
        }
        else {
            System.out.println("False\n");
        }

    }

    public static void armstronglist(int N1, int N2) {
        int count = 0;
        while (N1<=N2){
            int armstronglist=0;
            int a = N1;
            int b = N1;
            int digit1 = 0;
            while (a>0) {
                int rem = a % 10;
                a = a / 10;
                digit1 = digit1 + 1;
            }
            while (b>0){
                int rem1 = b % 10;
                b = b / 10;
                armstronglist = (int) (armstronglist+Math.pow(rem1,digit1));
            }
            if (N1==armstronglist){
                System.out.print(N1+" ");
                count = count+1;
            }
            N1 = N1+1;

        }
        if(count == 0){
            System.out.println("No Armstrong number between the range");

        }


    }
}
