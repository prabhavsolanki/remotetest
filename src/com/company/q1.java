package com.company;

import java.util.Scanner;
class Processor extends Thread {
    private volatile boolean running = true; //The values of volatile variable will never be cached.
    public void run() {
        while(running) {
            System.out.println("hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }    }  }
    public void stopthread() {//The values of volatile variables will always be updated directly from the main memory.
        running = false; 	 //It will change the value to false so as to stop the thread.
    }}
public class q1 {
    public static void main(String[] args) {
        Processor proc1 = new Processor();
        proc1.start();	//The thread is now in running state
        new Scanner(System.in).nextLine(); //The thread will stop after pressing enter key.
        proc1.stopthread();
    }}