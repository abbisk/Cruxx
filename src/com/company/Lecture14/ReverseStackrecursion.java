package com.company.Lecture14;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStackrecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <N ; i++) {
            stack.push(s.nextInt());
        }
//        for (int i = 0; i <N ; i++) {
//            System.out.println(stack.pop());
//
//        }
    reversestack(stack);
    }

    public static void reversestack(Stack<Integer> stack) {
        if(stack.size()==0){
            return;
        }
        int temp = stack.pop();
        reversestack(stack);
        System.out.println(temp);
    }
}
