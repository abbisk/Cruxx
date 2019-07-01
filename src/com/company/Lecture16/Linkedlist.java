package com.company.Lecture16;

public class Linkedlist {

    private Node head;
    private Node tail;
    private int size;

    public Linkedlist(){
        size = 0;
    }

    // display function to display the element of the linkedlist
    public void display(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    // insert value at first of the linkedlist
    public void insertfirst(int element){

        Node node= new Node(element);
        node.next = head;
        head = node;

        if(tail==null){
            tail= head;
        }
        size++;
    }
    // insert value at last of the linkedlist
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

    // delete first element from the linkedlist
    public int deletefirst(){

        if(head==null){
            tail=null;
        }
        int temp = head.value;
        head = head.next;
        size--;
        return temp;
    }

    // delete last value from linkedlist without using getnode function
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

    // delete last element using getnode function
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

    // get node at given index
    public Node getnode(int index){
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // insert element in linkedlist at a given index
    public void insertatindex(int index,int item){
        if(index ==0){
            insertfirst(item);
            return;
        }
        if(index == size){
            insertlast(item);
        }
        Node prev = getnode(index-1);
        Node node = new Node(item);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    // delete element at index
    public int deleteatindex(int index){
        if (index ==0){
            deletefirst();
            return index;
        }
        if(index == size-1){
            deletelast();
            return index;
        }
        Node prev = getnode(index-1);
        int temp = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return temp;
    }

    // search element and return node
    public Node find(int item){
        Node node = head;
        while (node!=null){
            if (node.value ==item){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // reverse linkedlist
    public void reverse(){
        reverse(head);
    }

    private void reverse(Node node){
        if(node==tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail =node;
        tail.next = null;
    }
    // Delete duplicate values in linkedlist;
    public void duplicate() {
        Node node = head;

        while (node.next != null) {
            if (node.next.value == node.value) {
                node.next = node.next.next;
                size = size - 1;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // merge sort
    public Linkedlist mergesort(Linkedlist first, Linkedlist second){
        Node firstnode = first.head;
        Node secondnode = second.head;

        Linkedlist linkedlist = new Linkedlist();
        while(firstnode != null && secondnode != null){

            if(firstnode.value<secondnode.value){
                linkedlist.insertlast(firstnode.value);
                firstnode = firstnode.next;
            }
            else {
                linkedlist.insertlast(secondnode.value);
                secondnode = secondnode.next;
            }
        }
        while (firstnode != null){
            linkedlist.insertlast(firstnode.value);
            firstnode = firstnode.next;
        }
        while (secondnode != null){
            linkedlist.insertlast(secondnode.value);
            secondnode = secondnode.next;
        }
        return linkedlist;
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
