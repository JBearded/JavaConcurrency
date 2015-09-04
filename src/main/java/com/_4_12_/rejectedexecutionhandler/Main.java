package com._4_12_.rejectedexecutionhandler;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

	public static void main(String[] args) {
		
		RejectedTaskController controller = new RejectedTaskController();
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		executor.setRejectedExecutionHandler(controller);
		
		System.out.printf("Main: Starting.\n");
		for(int i = 0; i < 3; i++){
			Task task = new Task("Task "+i);
			executor.submit(task);
		}
		
		System.out.printf("Main: shutting down the Executor.\n");
		executor.shutdown();
		
		System.out.printf("Main: Sending another Task.\n");
		Task task = new Task("RejectedTask");
		executor.submit(task);
		
		System.out.printf("Main: End\n");
	}
}
