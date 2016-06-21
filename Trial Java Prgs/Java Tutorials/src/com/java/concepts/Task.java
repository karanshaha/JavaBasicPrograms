package com.java.concepts;

final class Task implements Runnable{
    private int taskId;
  
    public Task(int id){
        this.taskId = id;
    }
  
    @Override
    public void run() {
        System.out.println("Task ID : " + this.taskId +" performed by " 
                           + Thread.currentThread().getName());
        
    }
    
    public static void main(String s[]){
    	Task t = new Task(100);
    	Thread thread = new Thread(t);
    	thread.start();
    	thread.run();
    	thread.start();
    }
  
}