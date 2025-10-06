package com.bptn.course._08_inheritance_in_depth;

public class Account {

	private String name;
	protected double balance;

	public Account( String name, double balance ){
		this.name = name;
		this.balance = balance;
	}

	public String toString(){
			return this.name + "," + " " + this.balance + ": ";
	}

	public boolean deposit(double amount){
		if(amount > 0){
			balance += amount;
			System.out.println(amount + " deposited into account.");
			return true;
		}else{
			return false;
		}
	}

	public boolean withdraw(double amount) {
    if (amount < balance) {
        balance -= amount;

        if (balance > 0) {
            System.out.println(amount + " withdrawn from account.");
        } else if( balance <= 0) { // balance == 0
        	balance -= balance;
            System.out.println(amount + " withdrawn from account. Account balance empty.");
        }

        return true;

    } else {
    	amount = balance;
    	balance = amount - balance;
    	System.out.println(amount + " withdrawn from account. Account balance empty.");
        System.out.println("Account balance empty.");
        return false;
    }
}


	public static void main(String[] args) {
		
		SavingsAccount a1 = new SavingsAccount("Betty", 10000, 20);
		CheckingAccount a2 = new CheckingAccount("Huay", 3000, 150);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
		a1.withdraw(4000);
		a1.withdraw(7000);
		a1.deposit(1500);
		
		a2.withdraw(3200);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
		

	}
}
