package com._2_2_.synchronized_method;

public class Account {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public synchronized void addAmount(double amount){
		double temp = balance;
		try{
			Thread.sleep(10);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		temp += amount;
		balance = temp;
	}
	
	public synchronized void subtractAmount(double amount){
		double temp = balance;
		try{
			Thread.sleep(10);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		temp -= amount;
		balance = temp;
	}
	
}
