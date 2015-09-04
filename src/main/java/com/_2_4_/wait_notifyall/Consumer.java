package com._2_4_.wait_notifyall;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable{

	private EventStorage storage;
	
	public Consumer(EventStorage storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		
		for(int i = 0; i < 100; i++){
			storage.get();
			try {
				Random random = new Random(new Date().getTime());
				int time = (int)(random.nextDouble()*10);
				TimeUnit.SECONDS.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	
}
