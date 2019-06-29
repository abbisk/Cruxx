package com.company.Lecture14;

import java.util.Stack;

public class DeleteefficientQueue{
    java.util.Stack<Integer> first;
    Stack<Integer> second;

    public DeleteefficientQueue(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void insert (int element){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(element);
        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int remove(){
        return first.pop();
    }
    public int peek(){
        return first.peek();
    }
    public boolean isempty(){
        return first.isEmpty();
    }
}
