package com.bptn.course._08_inheritance_in_depth;

public class CheckingAccount extends Account {
	  private double overdraft;

	  // constructor for CheckingAccount class
	  public CheckingAccount(String name, double balance, double overdraft){
	    super(name, balance);
	    this.overdraft = overdraft;
	  }

	  // override toString method from the parent class Account

	  public String toString() {
	        return super.toString() + ", Overdraft Fee: " + overdraft;
	    }
	  
	  //override the withdraw method from parent class Account
	  public boolean withdraw(double amount){
	    
				if( amount <= balance){
	        balance -= amount;
	        if(balance > 0){

	          System.out.println(amount + " withdrawn from account.");
	          
	        }else if(balance == 0){

	          System.out.println(amount + " withdrawn from account. Account balance empty.");

	        }
	        
	        return true;
			}else{
	          System.out.println(balance + " withdrawn from account. Account balance empty.");
	          System.out.println("Account in overdraft. Overdraft fee applied.");
	          balance -= balance;
	          overdraft = 150.0;
	          balance -= overdraft;
	          return false;
	        }
	      
	  }

	}

