package com.company.Lecture11;

public class human {
    String name; /////////Instance variable
    int bankbalance;//////// State
    static int population = 0;

    /////Final variable does not allow to change any variable

    public human(){
//        bankbalance = 10000;//////// State
        /// Constructure inside condtructure
        this(1000000,"annoymus");
    }



    public human (int bankbalance){ // Constructure with this keyword
        this.bankbalance = bankbalance;
    }

    public human (int bankbalance, String name){  // Constructure woth two parameter
        //here this is referencing towards constructure name and balance

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
    ////////////  Behaviour 2 type state dependent and independent
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
