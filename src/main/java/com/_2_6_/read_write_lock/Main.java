package com._2_6_.read_write_lock;

public class Main {

	public static void main(String[] args) {
		
		PricesInfo pricesInfo = new PricesInfo();
		
		Reader readers[] = new Reader[5];
		Thread readerThread[] = new Thread[5];
		for(int i = 0; i < 5; i++){
			readers[i] = new Reader(pricesInfo);
			readerThread[i] = new Thread(readers[i]);
		}
		
		Writer writer = new Writer(pricesInfo);
		Thread writerThread = new Thread(writer);
		
		for(int i = 0; i < 5; i++){
			readerThread[i].start();
		}
		writerThread.start();
	}
}
