package com.company.Lecture15;

import javax.print.attribute.standard.NumberOfDocuments;

public class Linkedlist {

    private Node head;
    private Node tail;
    private int size;

    public Linkedlist(){
        size = 0;
    }

    public void display(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertfirst(int element){

        Node node= new Node(element);
        node.next = head;
        head = node;

        if(tail==null){
            tail= head;
        }
        size++;
    }

    public void insertlast(int element){
        if(size ==0){
            insertfirst(element);
            return;
        }
        Node node = new Node(element);
        tail.next = node;
        tail=node;
        size++;
    }

    public int deletefirst(){

        if(head==null){
            tail=null;
        }
        int temp = head.value;
        head = head.next;
        size--;
        return temp;
    }
//    public int deletelast(){
//
//        if(size<2){
//            size--;
//            return deletefirst();
//        }
//        Node node = head;
//        while (node.next!=tail){
//            node = node.next;
//        }
//        int temp = tail.value;
//        tail=node;
//        tail.next=null;
//        size--;
//        return temp;
//    }
    public int deletelast(){

        if(size<2){
            size--;
            return deletefirst();
        }
        Node node = getnode(size-2);
        int temp = tail.value;
        tail=node;
        tail.next=null;
        size--;
        return temp;
    }
    public Node getnode(int index){
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
