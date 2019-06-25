package com.company.Lecture13;

public class Queuecircular {

    private int data[];

    private int DEFAULT_SIZE = 10;

    private int end = 0;
    private int front = 0;
    private int size = 0;


    public Queuecircular() {
        data = new int[DEFAULT_SIZE];
    }

    public Queuecircular(int size){
        data = new int[size];
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
        end = end%data.length;
        size++;
        return true;
        }

    public int remove()throws Exception{
        if(isempty()){
            throw new Exception("Queue id empty");

        }
        int temp = data[front++];
        front = front%data.length;
        size--;
        return temp;
    }
    public void display(){
        for (int i = 0; i <end ; i++) {
            System.out.println(data[i]);
        }
    }
}