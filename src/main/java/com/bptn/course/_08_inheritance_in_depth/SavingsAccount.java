package com.bptn.course._08_inheritance_in_depth;

public class SavingsAccount extends Account {
    private double rate;
    public SavingsAccount(String name, double balance, double rate){
        super(name, balance);
        this.rate = rate;
    }

    public String toString() {
        return super.toString() + ", Interest Rate: " + rate;
    }


}

