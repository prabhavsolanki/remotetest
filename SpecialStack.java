package com.company;
import java.util.Scanner;
import java.util.Stack;

public class SpecialStack {
    // Integer keeping track of minimum element
    Integer min;
    Stack<Integer> stack;

    SpecialStack(){
        stack = new Stack<Integer>();
    }

    // Push operation
    void push(Integer x){
        if(stack.isEmpty()){
            min = x;
            stack.push(x);
        }

        // Updating min if new element is smaller than min
        if(x < min){
            stack.push(2*x - min);
            min = x;
        } else {
            stack.push(x);
        }

        System.out.println("Inserted element into stack: " + x);
    }

    void pop(){
        if(stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Integer popped = stack.pop();

        // Updating min if popped element was the minimum
        if(popped < min){
            System.out.println("Removed top most element: " + min);
            min = 2*min - popped;
        } else {
            System.out.println("Removed top most element: " + popped);
        }
    }

    void peek(){
        if (stack.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Integer top = stack.peek();

        if(top < min){
            System.out.println("Top most element is " + min);
        } else {
            System.out.println("Top most element is " + top);
        }
    }

    void getMin(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Minimum element is " + min);
    }
}


// Driver class
class Driver10 {

    public static void main(String[] args) {
        SpecialStack stack  = new SpecialStack();
        Scanner scr = new Scanner(System.in);
        stack.push(12);
        stack.push(3);
        stack.push(2);
        stack.getMin();
        stack.pop();
        stack.getMin();

        while(true){
            System.out.println("\n1 - push()");
            System.out.println("2 - pop()");
            System.out.println("3 - getMin()");
            System.out.println("4 - peek()");
            System.out.println("5 - exit()");
            System.out.print("Enter operation to perform: ");

            String ch = scr.nextLine();

            switch (ch){
                case "1" :
                    System.out.println("Enter element to push");
                    Integer temp = Integer.parseInt(scr.nextLine());
                    stack.push(temp);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    stack.getMin();
                    break;
                case "4":
                    stack.peek();
                    break;
                case "5":
                    System.out.println("\nGoodbye...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}