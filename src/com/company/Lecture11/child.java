package com.company.Lecture11;

public class child {
    public static void main(String[] args) {
//        human subham = new human();
        human subham = new human(500000);
        subham.name = "Subham sir";
        System.out.println(subham.name);
        System.out.println(subham.bankbalance);
        subham.loan();

        subham.name = "Ironman";
        System.out.println(subham.name);
        System.out.println(subham.bankbalance);

        for (int i = 0; i <1000000000 ; i++) {
            new human();

        }

        }
    }
