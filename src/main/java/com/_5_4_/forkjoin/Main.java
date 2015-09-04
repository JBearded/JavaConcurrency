package com._5_4_.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {
		
		ForkJoinPool pool = new ForkJoinPool();
		
		FolderProcessor system = new FolderProcessor("c:\\Documents", "log");
		FolderProcessor apps = new FolderProcessor("c:\\Program Files", "log");
		FolderProcessor documents = new FolderProcessor("c:\\Documents And Settings", "log");
	}
}
