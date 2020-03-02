package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Ans1 {

    public static void main(String[] args) {
        Driver2 driver = new Driver2();
        System.out.println("Sum: " + driver.listSum());

    }
}

class Driver2 {
    List<Float> list = new LinkedList<Float>();


    public float listSum() {

        // Adding floating numbers to list
        list.add(3.25f);
        list.add(11.05f);
        list.add(36.896f);
        list.add(0.12f);
        list.add(11.13f);

        Iterator<Float> it = list.iterator();
        float sum = 0;

        //Iterating over the list
        while(it.hasNext()){
            sum+=it.next();
        }
        return sum;
    }
}