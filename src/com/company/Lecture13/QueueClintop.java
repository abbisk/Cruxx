package com.company.Lecture13;

import com.company.Lecture12.Queue;

public class QueueClintop {
    public static void main(String[] args) {
        Queueoptimise q= new Queueoptimise();
        for (int i = 0; i <100 ; i++) {
            q.insert(i);
            q.display();

        }
        for (int i = 0; i <100 ; i++) {
            try {
                q.remove();
            } catch (Exception e) {
                e.printStackTrace();
            }
            q.display();
        }

    }
}
