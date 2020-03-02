package com.company;

import java.util.*;

public class Ans3 {
    String inputString;

    public void printOccurrence(){
        String[] listOfCharacters = inputString.replace(" ", "").toLowerCase().split("");
        Set<String> setOfCharacters = new LinkedHashSet<>(Arrays.asList(listOfCharacters));

        System.out.println("Number of occurrences of characters in '" + inputString + "': ");

        for (String character : setOfCharacters) {
            System.out.println(character + ": " + Collections.frequency(Arrays.asList(listOfCharacters), character));
        }
    }
}

// Input and Driver code
class Driver3 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("2. Write a method that takes a string and returns the number of unique characters in the string.\n");
        System.out.println("Press Y/y for custom input or any other key for default inputs");
        String choice = scr.nextLine();
        String inputString;
        switch (choice){
            case "Y":
            case "y":
                System.out.print("Enter input string: ");
                inputString = scr.nextLine();
                break;
            default:
                inputString = "So Dark the Con of Man";
        }

        Ans3 ans = new Ans3();
        ans.inputString = inputString;
        ans.printOccurrence();
    }
}