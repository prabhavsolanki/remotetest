package com.company;

class Processor2 extends Thread {
    private int x = 0;

    public synchronized void sum() {  //synchronized method so only one thread could occupy it.,
        x++;
    }

    Thread t1 = new Thread(new Runnable() { //two threads
        public void run() {
            for (int i = 0; i < 1000; i++) {
                sum();
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    Thread t2 = new Thread(new Runnable() { //second thread
        public void run() {
            for (int i = 0; i < 1000; i++) {
                sum();//calling synchronized sum method
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    public void callsum() {
        long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        System.out.println("value of x before joining: " + x);    //value of x before joining.
        try {
            t1.join();        //values are joined
            t2.join();        //values are joined
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("value of x after joining :" + x);
        long y = end - start;
        System.out.println("Thread sleeping for 3 sec ");
        System.out.println("Total time taken is: " + y);
    }
}
    public class q6{
        public static void main(String[] args) {
            Processor2 obj1 = new Processor2();
            obj1.callsum();}}