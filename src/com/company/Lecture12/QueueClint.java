package com.company.Lecture12;

import com.company.Lecture12.Queue;

public class QueueClint {
    public static void main(String[] args) {
        Queue q= new Queue();
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.display();
        System.out.println();
        try{
            System.out.println(q.remove());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        q.display();
    }
}

