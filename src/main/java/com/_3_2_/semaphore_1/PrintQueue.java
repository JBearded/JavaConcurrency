package com._3_2_.semaphore_1;

import java.util.concurrent.Semaphore;

public class PrintQueue {

	private final Semaphore semaphore;

	public PrintQueue() {
		this.semaphore = new Semaphore(1, true);
	}
	
	public void printJob(Object document){
		try{
			semaphore.acquire();
			long duration = (long)(Math.random()*10);
			System.out.printf("%s: PrintQueue: Printing a Job during %d seconds\n", Thread.currentThread().getName(), duration);
			Thread.sleep(duration);
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			semaphore.release();
		}
	}
	
}
