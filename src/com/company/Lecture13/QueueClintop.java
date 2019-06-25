package com.company.Lecture13;

import com.company.Lecture12.Queue;

public class QueueClintop {
    public static void main(String[] args) {
        Queueoptimise q= new Queueoptimise();
        for (int i = 0; i <10 ; i++) {
            q.insert(i);
            q.display();

        }
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

