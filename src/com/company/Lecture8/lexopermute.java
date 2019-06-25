package com.company.Lecture8;

import java.util.Arrays;

public class lexopermute {
    public static void main(String[] args) {
        String s = "ab";
        int freq[] = frequency(s);
//        System.out.println(Arrays.toString(freq));
        lexopermute("",freq,2);

    }

    public static int[] frequency(String s) {
        int ar[] = new int[26];

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            ar[ch-'a']++;

        }
        return ar;

    }

    public static void lexopermute(String processed, int[] freq,int length) {
        if (length==0) {
            System.out.println(processed);
            return;
        }
        for (int i = 0; i <freq.length ; i++) {
            if(freq[i]>0){
//                freq[i]--;
                lexopermute(processed+(char)(i+'a'),freq,length-1);
                freq[i]++;
            }

        }

    }
}
