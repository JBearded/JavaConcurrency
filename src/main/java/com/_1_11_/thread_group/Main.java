package com._1_11_.thread_group;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup group = new ThreadGroup("Searcher");
		
		Result result = new Result();
		SearchTask task = new SearchTask(result);
		
		for(int i = 0; i < 5; i++){
			Thread thread = new Thread(group, task);
			thread.start();
			TimeUnit.SECONDS.sleep(1);
		}
		
		System.out.printf("Number of Threads: %d\n", group.activeCount());
		System.out.printf("Information about the Thread Group\n");
		group.list();
		
		Thread[] threads = new Thread[group.activeCount()];
		group.enumerate(threads);
		for(int i = 0; i < group.activeCount(); i++){
			System.out.printf("Thread %s: %s\n", threads[i].getName(), threads[i].getState());		
		}
		
		waitFinish(group);
//		group.interrupt();
	}
	
	private static void waitFinish(ThreadGroup group){
		while(group.activeCount() > 9){
			try{
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
