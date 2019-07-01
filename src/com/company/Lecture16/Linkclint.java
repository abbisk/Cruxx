package com.company.Lecture16;

import com.company.Lecture16.Linkedlist;

public class Linkclint {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertfirst(12);
        list.insertfirst(13);  // 13 will insert first then 12 will insert
        list.insertlast(15);
        list.insertlast(15);
        list.insertlast(15);
        list.insertlast(16);
        list.insertlast(17);
        list.display();
        System.out.println("delete first");
        list.deletefirst();
        list.display();
        System.out.println("Delete last");
        list.deletelast();
        list.display();
        System.out.println("Insert at given index ");
        list.insertatindex(1,20);
        list.display();
        System.out.println("Remove duplicates");
        list.duplicate();
        list.display();
        System.out.println("After reverse");
        list.reverse();
        list.display();

        System.out.println(list.find(20));
    }
}
