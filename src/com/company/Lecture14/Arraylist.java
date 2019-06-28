package com.company.Lecture14;

import java.util.Scanner;

public class Arraylist {


    private int data[];
    protected int DEFAULT_SIZE = 10;
    private int size = 0;

    public Arraylist(){
        data = new int[DEFAULT_SIZE];

    }

    public void add(int item){
        if(isfull()){
            resize();
        }
        System.out.println("Item is added "+item);
        data[size++] = item;
    }

    private boolean isfull() {
        return size == data.length;
    }

    private void resize() {
        System.out.println("Size is getting doubled");
        int temp[] = new int[data.length*2];
        for (int i = 0; i <data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        System.out.println("Item is remove");
        return data[--size];

    }
    public int get(int index){
        return data[index];


    }
    public void set(int item, int index){
        data[index]= item;

    }
}
