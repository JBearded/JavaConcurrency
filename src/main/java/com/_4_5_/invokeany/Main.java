package com._4_5_.invokeany;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		String username = "test";
		String password = "test";
		
		UserValidator ldapValidator = new UserValidator("LDAP");
		UserValidator dbValidator = new UserValidator("DataBase");
		UserValidator lgValidator = new UserValidator("LOGIN");
		
		TaskValidator ldapTask = new TaskValidator(ldapValidator, username, password);
		TaskValidator dbTask = new TaskValidator(dbValidator, username, password);
		TaskValidator lgTask = new TaskValidator(lgValidator, username, password);
	
		List<TaskValidator> taskList = new ArrayList<>();
		taskList.add(ldapTask);
		taskList.add(dbTask);
		taskList.add(lgTask);
		
		ExecutorService executor = Executors.newCachedThreadPool();
		String result;
		try{
			result = executor.invokeAny(taskList);
			System.out.printf("Main: Result: %s\n",result);
		}catch(InterruptedException e){
			e.printStackTrace();
		}catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		executor.shutdown();
		System.out.printf("Main: End of the Execution\n");
		
		
	}
}
