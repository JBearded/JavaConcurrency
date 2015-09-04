package com._1_12_.group_uncaught_exception;

public class Main {

	public static void main(String[] args) {
		
		MyThreadGroup group = new MyThreadGroup("MyThreadGroup");
		Task task = new Task();
		
		for(int i = 0; i < 2; i++){
			Thread thread = new Thread(group, task);
			thread.start();
		}
	}
}
