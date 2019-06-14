package com.company.Lecture6;

public class Strings {
    public static void main(String[] args) {
        String s = "abhisihbc";
//        poalindrome(s);
//
//        System.out.println(s.charAt(0));
//        String j = " World";
//        System.out.println(j);
//        String line= "Hello";

//        System.out.println(s.equals(line));
//        System.out.println(s+j);
//
//        System.out.println(s.indexOf("e"));
//        System.out.println(s.concat(line));
//        System.out.println(s.substring(0,4));
        substring(s);

    }
    public static void substring(String s) {
        int flag = 0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <=s.length(); j++) {
                System.out.println(s.substring(i,j));
                flag = flag+1;

            }

        }

        System.out.println(flag);
    }

    public static void poalindrome(String s){
        int flag = 0;
        for (int i = 0; i <s.length()/2 ; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = 1;
                break;

            }
        }
            if(flag==0){
                System.out.println("Palindrome");
            }
            else {
                System.out.println("Not a palendrome");
            }
        }



    }

