package com._4_8_.scheduledrate;

import java.util.Date;

public class Task implements Runnable{

	private String name;

	public Task(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.printf("%s: Starting at: %s\n",name, new Date());
	}

	
	
	
	
}
