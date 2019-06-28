package com.company.Lecture14;

public class StackClint {
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        for (int i = 0; i < 100; i++) {
            stack.push(i);
            try {
//            int c = 5/0;
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
                for (int j = 0; j < 100; j++) {
                    stack.push(j);

                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Hello");
            }
        }
    }
}
