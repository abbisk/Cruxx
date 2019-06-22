package com.company.Lecture11;

public class child {

    public static void main(String[] args) {

//        human subham = new human();
        int ar[] = new int[20];
        human subham = new human(500000);
        subham.name = "Gauranga";
        System.out.println(subham.name);
        System.out.println(subham.bankbalance);
        subham.loan();

        human abhishek = new human();
        subham.name = "Narshimha";
        System.out.println(abhishek.name);
        System.out.println(abhishek.bankbalance);

        for (int i = 0; i <1000000000 ; i++) {
            human h = new human();

        }

        }
    }
