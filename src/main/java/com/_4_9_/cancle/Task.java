package com._4_9_.cancle;

import java.util.concurrent.Callable;

public class Task implements Callable<String>{

	@Override
	public String call() throws Exception {
		while(true){
			System.out.printf("Task: Test\n");
			Thread.sleep(100);
		}
	}
	
	

}
