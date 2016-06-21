package com.java.concepts;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class InterThreadCommunicationExample {

    public static void main(String args[]) {

        final Queue sharedQ = new LinkedList();
        final BlockingQueue blockingQueue = new LinkedBlockingQueue();

       /*Thread producer = new Producer(sharedQ);
        Thread consumer = new Consumer(sharedQ);*/
        
        Thread producer = new ProducerBlockingQ(blockingQueue);
        Thread consumer = new ConsumerBlockingQ(blockingQueue);
        
        
        consumer.start();
        producer.start();
       

    }
}

