package com.java.concepts;
import java.util.concurrent.BlockingQueue;

 public class ProducerBlockingQ extends Thread {
    private final BlockingQueue sharedBQ;

    public ProducerBlockingQ(BlockingQueue sharedBQ) {
        super("Producer");
        this.sharedBQ = sharedBQ;
    }

    @Override
    public void run() {

        for (int i = 0; i < 4; i++) {

        	try {
                System.out.println("Produced: " + i);
                sharedBQ.put(i);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}


