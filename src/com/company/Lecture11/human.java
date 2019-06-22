package com.company.Lecture11;

public class human {
    String name;   //Instance variable

    int bankbalance;  // State

    static int population = 0;

    //    Final does not allow to change any variable

    public human(){
//        bankbalance = 10000;  // State
        /// Constructor inside constructor
        this(1000000,"annoymus");
    }



    public human (int bankbalance){// Constructor with this keyword

//        this.bankbalance = bankbalance;
        this(bankbalance,"Anonymous");
    }

    public human (int bankbalance, String name){  // Constructor with two parameter

        //here bank balance is pointing towards class bank balance

        this.bankbalance= bankbalance;
        this.name = name;
        System.out.println("Piada ho gya");
        population++;
    }

    public int loan() {

        int t = bankbalance / 10;
        bankbalance = bankbalance - t;
        System.out.println(name + "Yar garib ho raha hu " + bankbalance);
        return t;
    }

    //Behaviour has 2 type state 1.dependent and 2.independent

    public void eat(){
        System.out.println("I am hungry");

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        System.out.println("banda mar gaya ");
        population--;
    }
}
