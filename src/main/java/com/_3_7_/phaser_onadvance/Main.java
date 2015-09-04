package com._3_7_.phaser_onadvance;

public class Main {

	public static void main(String[] args) {
		
		MyPhaser phaser = new MyPhaser();
		
		Student students[] = new Student[5];
		for(int i = 0; i < students.length; i++){
			students[i] = new Student(phaser);
			phaser.register();
		}
		
		Thread threads[] = new Thread[students.length];
		for(int i = 0; i < threads.length; i++){
			threads[i] = new Thread(students[i], "Student "+i);
			threads[i].start();
		}
		
	}
}
