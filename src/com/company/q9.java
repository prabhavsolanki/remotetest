package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Processor9 implements Runnable {
    private CountDownLatch latch;

    public Processor9(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        System.out.println("Started.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        latch.countDown();
    }
}

public class q9 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);	//created three latch
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int i=0; i < 3; i++) {
            executor.submit(new Processor9(latch));
        }
        try {
            latch.await();	//decrease the value by1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed.");
        executor.shutdown();

    }}