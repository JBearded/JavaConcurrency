package com._1_13_.threadfactory;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable{

	public void run() {
		try{
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	
}
