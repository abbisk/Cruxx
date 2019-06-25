package com.company.Lecture13;

public class Queueoptimise {

    private int data[];

    private int DEFAULT_SIZE = 10;

    private int end = 0;
    private int front = 0;
    public Queueoptimise() {
        data = new int[DEFAULT_SIZE];
    }

    public Queueoptimise(int size){
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
        return true;
        }

    public int remove()throws Exception{
        if(isempty()){
            throw new Exception("Queue id empty");

        }
        return data[front++];
    }
    public void display(){
        for (int i = 0; i <end ; i++) {
            System.out.print(data[i]+",");
        }
    }
}