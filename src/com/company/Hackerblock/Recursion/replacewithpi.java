package com.company.Hackerblock.Recursion;

import java.util.Scanner;

public class replacewithpi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        while (count>0) {
            Scanner j = new Scanner(System.in);
            String n = j.nextLine();
            System.out.println(changetopi("", n));
            count--;
        }

    }

    public static String changetopi(String processed, String unprocessed) {
        if (unprocessed.length() < 2) {
            return processed + unprocessed;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'p' && unprocessed.charAt(1) == 'i') {
            return changetopi(processed + "3.14", unprocessed.substring(2));

        }
        return changetopi(processed + ch, unprocessed.substring(1));
    }
}
