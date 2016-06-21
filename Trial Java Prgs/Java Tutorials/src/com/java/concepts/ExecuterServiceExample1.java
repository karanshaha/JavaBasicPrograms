package com.java.concepts;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterServiceExample1 {
	
	public static void main(String s[]) throws InterruptedException, ExecutionException{
		ExecutorService service = Executors.newCachedThreadPool();
	    for (int i =0; i<5; i++){
	        Future<Task> future =(Future<Task>) service.submit(new Task(i));
	        System.out.println(future.get());
	    }
	}
}


