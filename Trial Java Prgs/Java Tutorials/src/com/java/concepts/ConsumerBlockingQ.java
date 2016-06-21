package com.java.concepts;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQ extends Thread {
    private final BlockingQueue sharedBQ;

    
    public ConsumerBlockingQ(BlockingQueue sharedBQ) {
        super("Consumer");
        this.sharedBQ = sharedBQ;
    }
    
    

    @Override
    public void run() {
        while(true) {

        	try {
                System.out.println("Consumed: "+ sharedBQ.take());
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}



