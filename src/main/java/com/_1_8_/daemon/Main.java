package com._1_8_.daemon;

import java.util.ArrayDeque;
import java.util.Deque;


public class Main {

	
	public static  void main(String[] args) throws Exception {
		
		Deque<Event> deque = new ArrayDeque<Event>();
		
		WriterTask wTask = new WriterTask(deque);
		for(int i = 0; i < 3; i++){
			Thread thread = new Thread(wTask);
			thread.start();
		}
		
		CleanerTask cTask = new CleanerTask(deque);
		new Thread(cTask).start();
	}
}
