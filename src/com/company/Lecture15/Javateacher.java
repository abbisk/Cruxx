package com.company.Lecture15;

public class Javateacher implements Teacher{

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void teach() {
        System.out.println("Java padhata hu");

    }

    @Override
    public void study() {
        System.out.println("Java padh chuka hu");

    }
    public void dance(){
        System.out.println("I dance in java");

    }
}
