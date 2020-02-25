package com.company;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class waitnotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread running ....");
            System.out.println("Entering into wait");
            wait();	//It will enter into wait state
            System.out.println("Resumed.");
        } }
    public  void consume1() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000); //parallelly this thread will also start and will sleep for 2 sec
        synchronized (this) {
            System.out.println("Waiting for return key to exit wait");
            scanner.nextLine();	//on pressing enter key it will notify.
            System.out.println("Return key pressed.");
            notify();
            Thread.sleep(2000);
        }}
    void calling() throws InterruptedException { // method for creating two threads.
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } }});

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    consume1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } }});
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }}
public class q5 {
public static void main(String[] args) throws InterruptedException {
        waitnotify nn=new waitnotify(); //created object for class
        nn.calling();    }}