package com.company.Assignment5;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = obj.nextLine();
        palindrome(s);
        substring(s);
    }

    public static void palindrome(String s) {
        int flag =0;
        for (int i = 0; i <s.length()/2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    flag = flag + 1;
                    break;

                }
            }
                if(flag==0){
                    System.out.println("String is palindrome");
                }
                else {
                    System.out.println("String is nor palindrome");
                }

            }

    public static void substring(String  s) {
        int flag = 0;
        for (int i = 0; i <s.length(); i++) {
            for (int j = i+1; j <s.length() ; j++) {
                System.out.println(s.substring(i,j));
                flag = flag+1;

            }

        }
        System.out.println(flag);

    }

        }

