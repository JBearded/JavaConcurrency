package com._1_5_interrupted_exception;

import java.util.concurrent.TimeUnit;


public class Main {

	
	public static  void main(String[] args) throws Exception {
		
		Runnable task = new FileSearch("E:\\","gradlew.bat");
		Thread thread = new Thread(task);
		thread.start();
		
		try{
			TimeUnit.SECONDS.sleep(10);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		thread.interrupt();
		
	}
}
