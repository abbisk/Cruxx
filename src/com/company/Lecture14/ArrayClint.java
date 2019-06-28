package com.company.Lecture14;

public class ArrayClint {
    public static void main(String[] args) {
        Arraylist a = new Arraylist();

        for (int i = 0; i <100 ; i++) {
                a.add(i);
        }
        for (int i = 0; i <100 ; i++) {
            System.out.println(a.remove());
        }
    }
}
