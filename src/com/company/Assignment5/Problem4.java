package com.company.Assignment5;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner obj  = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = obj.nextLine();
//        System.out.println(replaceevenandodd(s));

        ///////////// For subsequence
//        int start = obj.nextInt();
//        int end = obj.nextInt();
//        System.out.println(subsequence(s,start,end));
        System.out.println(ascibetweenpair(s));
    }

    public static StringBuilder replaceevenandodd(String s) {
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i <s.length() ; i++) {
            int flag = 0;
            char ch = s.charAt(i);
            if (i%2==0 && s.charAt(i)=='z'){
                builder.setCharAt(i,'a');
                flag = flag+1;
            }
            if (i%2==0 && s.charAt(i)=='Z') {
                builder.setCharAt(i, 'A');
                flag = flag+1;
            }

            if (i%2!=0 && s.charAt(i)=='a') {
                builder.setCharAt(i, 'z');
                flag = flag+1;

            }
            if (i%2!=0 && s.charAt(i)=='A') {
                builder.setCharAt(i, 'Z');
                flag = flag+1;

            }
            if (flag==0){
                if (i%2==0){

                    ch = (char) (ch+1);
                    builder.setCharAt(i,ch);
                }
                else{
                    ch = (char) (ch-1);
                    builder.setCharAt(i,ch);
                }

            }


        }

        return builder;
    }
    public static StringBuilder subsequence(String s,int start,int end) {
        String sub = "";
        StringBuilder builder = new StringBuilder(sub);
        for (int i =start; i <end ; i++) {
            char ch = s.charAt(i);
            builder.append(ch);

        }
        return builder;

    }
    public static StringBuilder ascibetweenpair(String s) {
        String sub = "";
        StringBuilder builder = new StringBuilder(sub);
        for (int i =0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            int flag =0;
            for (int j = i+1; j <i+2 ; j++) {
                if (i==0) {

                    builder.append(ch);
                    flag = flag+1;
                }
                char cha = s.charAt(j);
                int asci = cha-ch;
                if(flag==0){
                    if(i%2==0){
                        builder.append(ch);
                    }
                    else{
                        builder.append(asci);
                    }
                }
            }

            }

        return builder;


        }


}
