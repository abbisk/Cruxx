package com.company.Lecture13.Inheritance;

public class Engine {

    public void start(){  // If make this method static then we cant override in Petrol engine
        System.out.println("I am starting");
    }
    public void stop(){
        System.out.println("I am stopping");
    }
    public void accelerate(){
        System.out.println("I am accelerating");
    }
}
