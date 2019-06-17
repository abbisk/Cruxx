package com.company.Lecture8;

import java.util.Arrays;

public class lexopermute {
    public static void main(String[] args) {
        String s = "abcdefgaabbht";
        int freq[] = frequency(s);
        System.out.println(Arrays.toString(freq));

    }

    public static int[] frequency(String s) {
        int ar[] = new int[26];

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            ar[ch-'a']++;

        }
        return ar;

    }

    public static void lexopermute(String processed, int[] freq,) {
        if () {
            System.out.println(processed);
            return;
        }

    }
}
