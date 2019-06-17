package com.company.Lecture8;

import java.util.ArrayList;

public class Recursson {
    public static void main(String[] args) {
//        dice("",4);
//        permutaion("","");
//        replacewithpi("jashdfpoipipipiksdfja", "");
        ArrayList list = new ArrayList();
        System.out.println(changetopi("", "abcpipipipidef"));
        mezpath("",3,3);

    }

    public static void dice(String processed, int target) {
        if (target == 0) {
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(processed + i, target - i);

        }


    }

    public static void permutaion(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);

            permutaion(first + ch + second, unprocessed);

        }
    }

    public static String replacewithpi(String processed, String unprocessed) {
        if (processed.length() == 0)
            return processed;

        else {
            if (processed.endsWith("pi")) {
                unprocessed = 3.14 + unprocessed;
                return replacewithpi(processed.substring(0, processed.length() - 2), unprocessed);
            } else
                unprocessed = processed.charAt(processed.length() - 1) + unprocessed;

        }
        return replacewithpi(processed.substring(0, processed.length() - 1), unprocessed);

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

    public static void mezpath(String processed, int row, int col) {
        if(row==1&&col==1){
            System.out.println(processed);
//            return;
        }
        if(row>1){
            mezpath(processed+'V',row-1,col);
        }
        if(col>1){
            mezpath(processed+'H',row,col-1);
        }


    }
    public static ArrayList mezpathlist(String processed, int row, int col,ArrayList list) {
        if(row==1&&col==1){
            list.add(processed);
            return list;
        }
        if(row>1){
            mezpathlist(processed+'V',row-1,col,list);
        }
        if(col>1){
            mezpathlist(processed+'H',row,col-1,list);
        }
        return list;


    }

}

