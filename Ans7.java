package com.company;

import java.util.*;

// 7. Print the elements of an array in the decreasing frequency
// if 2 numbers have same frequency then print the one which came first.


public class Ans7 {

    public static void main(String[] args) {

        // Declare and Initialize an array
        int[] array = {2, 2, 3, 3, 3, 1, 1, 4, 5, 5};

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> arrayMap = new LinkedHashMap<>();
        List<Integer> outputArray = new ArrayList<>();

        // Assign elements and their frequency in map
        for (int current : array) {
            int count = map.getOrDefault(current, 0);
            map.put(current, count + 1);
            outputArray.add(current);
        }

        // assign element and their corresponding index in the array
        for (int i = 0; i < array.length; i++) {
            arrayMap.put(array[i], i);
        }

        // Sort the map
        Collections.sort(outputArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer k1, Integer k2) {
                // Compare value by frequency
                int freqCompare = map.get(k2).compareTo(map.get(k1));

                // Compare value by position in input array
                int indexCompare = arrayMap.get(k1).compareTo(arrayMap.get(k2));

                // If frequency is equal, compare by array index
                if (freqCompare == 0)
                    return indexCompare;
                else
                    return freqCompare;
            }
        });

        // Final Output
        for (Integer i : outputArray) {
            System.out.print(i + " ");
        }
    }
}
