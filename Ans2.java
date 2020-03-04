package com.company;



// 2. Write a method that takes a string
// and returns the number of unique characters in the string.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ans2 {
    String inputString = "";

    public int uniqueCharacters(){
        System.out.println("String size: " + inputString.length());

        // Removing spaces, changing to lower case and splitting string into characters
        String[] list =  inputString.replace(" ", "").toLowerCase().split("");

        // Adding characters to set
        Set<String> set = new HashSet(Arrays.asList(list));
        return set.size();
    }
}

// Input and Driver code
class Driver {
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

        Driver driver = new Driver();
        Ans2 ans = new Ans2();
        ans.inputString = inputString;
        System.out.println("Number of Unique Characters in '"+ ans.inputString + "': " + ans.uniqueCharacters());

    }

}