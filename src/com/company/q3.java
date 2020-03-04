package com.company;

//Synchronized Block
class Process extends Thread {
    private int x = 0;
    public synchronized void sum() {    //synchronized method that will call sum
        x++;}
    Thread t1 = new Thread(new Runnable() {  //anonymous thread class t1
        public void run() {
            for (int i = 0; i < 1000; i++) {
                sum();
            }
            //System.out.println("exit 1");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace(); }}}
    );
    Thread t2 = new Thread(new Runnable() {  //anonymous thread class t2
        public void run() {
            for (int i = 0; i < 1000; i++) {
                sum();   }
//System.out.println("exit");
            try {
                Thread.sleep(3000);   //thread will sleep for 3 sec after incrementing for 1000 times
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}});
    public void callsum() {   //method that will call run method of thread class
        long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        try {
            t1.join();  //to join the output of t1 and t2 so main class will wait until threads are executed
            t2.join();//to join the output of t1 and t2 so main class will wait until threads are executed
        } catch (InterruptedException e) {
            e.printStackTrace();   }
        long end = System.currentTimeMillis();
        System.out.println("The value of count variable by synchronized method:" + x);
        long y=end -start;
        System.out.println("Total time taken is: " + y);  }}
//main class
public class q3 {
    public static void main(String[] args) {
        Process obj1 = new Process();  //object for class
        obj1.callsum();}} // object call in main method



/*
public class q3 {
    int a = 0;
    int b = 0;
    Object lock1 = new Object(); // created object for lock
    public void sum1() {  	// created method that will increment a
        synchronized (lock1) { //using our own intrinsic lock object
            a++;
        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
    public void sum2() { // created method that will increment b
        synchronized (this) { // using intrinsic lock of this
            b++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}   }
    public void addblock() {  // created method that will call sum1
        for (int i = 0; i < 1000; i++) {
            sum1();
        }   }
    public void addblock2() { // created method that will call sum2
        for (int i = 0; i < 1000; i++) {
            sum2();  }
    }
    Thread t3 = new Thread(new Runnable() { // anonymous inner thread class for creating thread 1
        public void run() {
            addblock();
        }});
        Thread t4 = new Thread(new Runnable() {// anonymous inner thread class for creating thread 2

            public void run() {
                addblock2();
            }});
    public void callsum2() {
        long start1 = System.currentTimeMillis();
        t3.start();
        t4.start();
        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("The value of count variable by synchronized block" +
                ":" + (a + b));
        long y1 = end1 - start1;
        System.out.println("Total time taken is: " + y1);
    }
    public static void main(String[] args) { // main class to create object for class and call it in main class
        q3 obj2 = new q3();
        obj2.callsum2();}}*/
