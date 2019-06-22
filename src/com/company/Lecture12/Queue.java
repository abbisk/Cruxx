package com.company.Lecture12;

public class Queue {

    private int data[];

    private int DEFAULT_SIZE = 10;

    private int end = 0;
    public Queue() {
        data = new int[DEFAULT_SIZE];
    }
    public boolean isfull() {
        return end == data.length;
    }

    public boolean isempty() {
        return end == 0;
    }

    public boolean insert(int element) {
        if (isfull()) {
            return false;
        }
        data[end++] = element;
        return true;
        }

    public int remove()throws Exception{
        if(isempty()){
            throw new Exception("Queue id empty");

        }
        int temp = data[0];
        for (int i = 1; i <end ; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return temp;

    }
    public void display(){
        for (int i = 0; i <end ; i++) {
            System.out.println(data[i]);
        }
    }
}