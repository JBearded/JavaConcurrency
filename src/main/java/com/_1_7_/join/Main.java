package com._1_7_.join;

import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Main {

	
	public static  void main(String[] args) throws Exception {
		
		Runnable dsLoader = new DataSourcesLoader();
		Thread thread = new Thread(dsLoader);
		thread.start();
		
		try{
			thread.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.printf("Main has finished: %s\n",new Date());
		
	}
}
