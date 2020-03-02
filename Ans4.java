package com.company;

import java.util.*;

public class Ans4 {
    String inputString;

    HashMap<String, Integer> wordFrequency = new HashMap<String, Integer>();

    public void sortHashMap(){

        // populating hashmap
        wordFrequency.put("One", 1);
        wordFrequency.put("Five", 5);
        wordFrequency.put("eleven", 11);
        wordFrequency.put("Two", 2);
        wordFrequency.put("Three", 3);

        // Displaying unsorted map
        System.out.println("\nUnsorted map: ");
        for (Map.Entry<String, Integer> stringIntegerEntry : wordFrequency.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " --> " + stringIntegerEntry.getValue());
        }

        // Creating a comparator of type EntrySet of the hashmap
        Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        };

        // Creating a list of entries of hashmap and sorting the list based on the custom comparator
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordFrequency.entrySet());
        Collections.sort(list, valueComparator);

        // Displaying sorted hashmap
        System.out.println("\nSorted (by value) Map: ");
        for (Map.Entry<String, Integer> stringIntegerEntry : list) {
            System.out.println(stringIntegerEntry.getKey() + "--> " + stringIntegerEntry.getValue());
        }
    }
}

class Driver4   {
    public static void main(String[] args) {
        Ans4 ans = new Ans4();
        ans.inputString = "Oh mama oh mama my heart and my kidney goes";
        ans.sortHashMap();

    }
}