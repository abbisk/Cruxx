package com.company.Lecture14;

public class Queuecircular {

    protected int data[];

    protected int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;


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
            throw new Exception("Queue is empty");

        }
        int temp = data[front++];
        front = front%data.length;
        size--;
        return temp;
    }
    public void display(){
        for (int i = 0; i <size ; i++) {
            System.out.println(data[(front+i)%data.length]+" ");
        }
        System.out.println();
    }
}