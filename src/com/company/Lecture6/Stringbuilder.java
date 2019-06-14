package com.company.Lecture6;

public class Stringbuilder {
    public static void main(String[] args) {
        String s = "heLLo";
        StringBuilder builder = new StringBuilder(s); //String builder object

//        System.out.println(builder.append(" World"));
//        builder.setCharAt(0,'!');
        System.out.println(builder);
//        System.out.println('a'-'z');
//        System.out.println(toggle(s));

        }

    public static StringBuilder toggle(String s) {
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i <builder.length() ; i++) {
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch = (char) ('a'+(ch-'A'));
            }
            else if(ch>='a' && ch<='z'){
                ch = (char) ('A'+(ch-'a'));
            }
            builder.setCharAt(i,ch);

        }
        return builder;


    }
}
