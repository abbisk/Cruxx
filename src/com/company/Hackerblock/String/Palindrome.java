package com.company.Hackerblock.String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        System.out.println(poalindrome(s));

    }
    public static boolean poalindrome(String s){
        for (int i = 0; i <s.length()/2 ; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;

            }
        }
        return true;
    }
}
