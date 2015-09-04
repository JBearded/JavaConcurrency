package com._2_4_.wait_notifyall;

import java.util.Date;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		EventStorage storage = new EventStorage();
		
		Producer producer = new Producer(storage);
		Thread producerThread = new Thread(producer);
		
		Consumer consumer = new Consumer(storage);
		Thread consumerThread = new Thread(consumer);
		
		producerThread.start();
		consumerThread.start();
	}
}
