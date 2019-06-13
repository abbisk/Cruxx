package com.company.Lecture6;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {


        int a = 4;
        Integer i = new Integer(a);
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add("Hello");
        arr.add(i);

        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);
        arr.set(2,99);
        System.out.println(arr);
        System.out.println(arr.indexOf(2));

    }
}
