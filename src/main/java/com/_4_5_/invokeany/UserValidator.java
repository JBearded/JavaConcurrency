package com._4_5_.invokeany;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class UserValidator {

	private String name;

	public UserValidator(String name) {
		this.name = name;
	}
	
	public boolean validate(String name, String password){
		try{
			long duration = (long)(Math.random()*10);
			System.out.printf("Validator %s: Validating a user during %d seconds\n", this.name, duration);
			TimeUnit.SECONDS.sleep(duration);
		}catch(InterruptedException e){
			return false;
		}
		return true;
	}
	
	public String getName(){
		return name;
	}
	
	
}
