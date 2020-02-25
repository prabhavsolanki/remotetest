package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Executor extends Thread {
    public int PRINT_NUMBERS_UPTO = 10;  //It will print numbers upto 10
    static int number = 1;
    int remainder;
    static Object lock = new Object();	//It will create lock
    Executor(int remainder) {
        this.remainder = remainder;
    }
    public void run() {
        while (number < PRINT_NUMBERS_UPTO) { //It will check the value of number should be less than 10
            synchronized (lock) {
                while (number % 2 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                        Thread.sleep(1000);//
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }}	//While loop ended
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }}}}

public class q4 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);// created thread pool
        pool.execute(new Executor(1)); //for odd number we take remainder as 1
        pool.execute(new Executor(0));//for even number we take remainder as 0
        pool.shutdown();}}  //To stop the executor service