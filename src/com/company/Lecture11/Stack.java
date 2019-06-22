package com.company.Lecture11;

public class Stack {
    private  int data[];

    private int DEFAULT_SIZE=10;

    private int top = -1;

    public Stack(){

        data = new int[DEFAULT_SIZE];
    }
    public boolean isfull(){

        return top == data.length-1;
    }
    public boolean isempty(){
        return top == -1;
    }
    public boolean push(int item){
        if(isfull()){
            return false;
        }
        data[++top]=item;
        return true;
    }
    public int pop() throws Exception{
        if(isempty()){
            throw  new myException("The array is Empty");

        }

        return data[top--];
    }
    public int top(){
        return 0;

    }
}
