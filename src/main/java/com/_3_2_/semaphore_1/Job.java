package com._3_2_.semaphore_1;

public class Job implements Runnable{

	private PrintQueue queue;
	
	public Job(PrintQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.printf("%s: Going to print a job\n", Thread.currentThread().getName());
		queue.printJob(new Object());
		System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
	}

	
}
