package com._1_4_.interrupted;


public class Main {

	
	public static  void main(String[] args) throws Exception {
		
		Thread task = new PrimeGenerator();
		task.start();
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		task.interrupt();
	}
}
