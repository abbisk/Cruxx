package com.company.Lecture13.Inheritance;

public class PetrolEngine extends Engine{
    public static void main(String[] args) { }
    public void makenoise(){
        System.out.println("Booooooooooooom");
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Petrol engine stop");
    }

    public void gear(){
        System.out.println("gear");
    }
    public void gear(int a,float b){
        System.out.println("Advanced");
    }
}
