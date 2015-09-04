package com._3_6_.Phaser;

import java.util.concurrent.Phaser;

public class Main {

	public static void main(String[] args) {
		
		Phaser phaser = new Phaser(2);
		
		FileSearch system = new FileSearch("C:\\Windows", "log", phaser);
		FileSearch apps = new FileSearch("C:\\Program Files", "log", phaser);
		 
		Thread systemThread = new Thread(system);
		systemThread.start();
		
		Thread appsThread = new Thread(apps);
		appsThread.start();
		
		try{
			systemThread.join();
			appsThread.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.printf("Terminated: %s\n",phaser.isTerminated());
	}
}
