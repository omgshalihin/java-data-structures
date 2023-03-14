package org.example.list;

import java.util.Stack;

public class StackPrac {
    //LIFO stack of objects
    //imagine pringles chips

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Check what's at the top of the stack
        System.out.println(stack.peek());
        System.out.println("size of stack: " + stack.size());

        // Check what's at the top of the stack and also remove it
        System.out.println(stack.pop());
        System.out.println("size of stack: " + stack.size());
    }


}
