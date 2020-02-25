package com.company;


/*
class runner extends Thread{        //Using thread class by extending it..
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("thread is running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}}}
public class q2 {
    public static void main(String[] args) {
        runner t1 = new runner();
        t1.start();
        Thread t2= new Thread(new runner());
        t2.start();
    }}*/



//Runnable
class Runnableinterface implements Runnable{ //Creating thread using implement method.
    public void run() {
        System.out.println("Creating thread ");}

    
}

public class q2{
    public static void main(String[] args) {
        //First way to create thread in implement method
        Runnable runnable = new Runnableinterface();
        Thread thread = new Thread(runnable);
        thread.start();
        //Second way of creating thread in implements method
        Thread t1= new Thread(new Runnableinterface());
        t1.start();
    }}