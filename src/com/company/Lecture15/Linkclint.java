package com.company.Lecture15;

public class Linkclint {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertfirst(12);
        list.insertfirst(13);  // 13 will insert first then 12 will insert
        list.insertlast(15);
        list.insertlast(16);
        list.insertlast(17);
        list.deletefirst();
        list.deletelast();
        list.display();
    }
}
