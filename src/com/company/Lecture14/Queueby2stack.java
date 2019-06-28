package com.company.Lecture14;

import java.util.Stack;

public class Queueby2stack {
    Stack <Integer> first;
    Stack<Integer>second;

    public void remove(int item){
        first.push(item);
    }
    public int peek(){
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int temp = second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return temp;
    }
}
