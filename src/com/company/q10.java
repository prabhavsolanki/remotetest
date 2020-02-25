package com.company;

import java.util.*;
class Work {
    public void produce() throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                System.out.println(i);
                System.out.println("Loop 1 Running....");
                wait(); // after first iteration of loop1 , loop2 will complete its whole task and there will be no notify so loop1 will enter into deadlock as it has only wait method.
            }
            System.out.println("Loop 1 ended");
        } }
    public void consume() throws InterruptedException {
        synchronized (this) {
            System.out.println("Loop 2 started");
            for (int i = 0; i < 3; i++) {
                System.out.println("Value of i :" + i);
                notify(); //There is no wait so it will execute its whole task and exit the loop so loop1 will never come out of wait state after second iteration.
            }
            System.out.println("Loop2  ended");}}}
public class q10 {
    public static void main(String[] args) throws InterruptedException {
        Work work = new Work();
        Thread t1 = new Thread(new Runnable() {  //creating thread 1
            public void run() {
                try {
                    work.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}});
        Thread t2 = new Thread(new Runnable() {  //creating thread 2
            public void run() {
                try {
                    work.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } } });
        t1.start();
        t2.start();
        t1.join();
        t2.join(); }}