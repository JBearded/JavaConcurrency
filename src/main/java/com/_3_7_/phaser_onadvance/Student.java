package com._3_7_.phaser_onadvance;

import java.util.Date;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

public class Student implements Runnable{

	private Phaser phaser;
	
	
	public Student(Phaser phaser) {
		this.phaser = phaser;
	}


	@Override
	public void run() {
		
		System.out.printf("%s: Has arrived to do the exam. %s\n", Thread.currentThread().getName(), new Date());
		phaser.arriveAndAwaitAdvance();
		
		System.out.printf("%s: Is going to do the first exercise. %s\n", Thread.currentThread().getName(), new Date());
		doExercise(1);
		System.out.printf("%s: Has done the first exercise. %s\n", Thread.currentThread().getName(), new Date());
		phaser.arriveAndAwaitAdvance();
		
		System.out.printf("%s: Is going to do the second exercise. %s\n", Thread.currentThread().getName(), new Date());
		doExercise(2);
		System.out.printf("%s: Has done the second exercise. %s\n", Thread.currentThread().getName(), new Date());
		phaser.arriveAndAwaitAdvance();
		
		System.out.printf("%s: Is going to do the third exercise. %s\n", Thread.currentThread().getName(), new Date());
		doExercise(3);
		System.out.printf("%s: Has finished the exercise. %s\n", Thread.currentThread().getName(), new Date());
		phaser.arriveAndAwaitAdvance();
		
	}
	
	private void doExercise(int i){
		try{
			long duration = (long)(Math.random()*10);
			TimeUnit.SECONDS.sleep(duration);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	
}
