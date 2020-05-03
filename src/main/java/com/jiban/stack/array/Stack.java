package com.jiban.stack.array;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stack {

    private static final Logger logger = Logger.getLogger(Stack.class.getName());

    private final int CAPACITY;
    private int[] arr;
    private int top = -1;

    public Stack(final int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.arr = new int[CAPACITY];
    }

    public void push(int data) {
        if (this.top >= this.CAPACITY) {
            logger.log(Level.SEVERE, "Stack Overflow.");
            return;
        }

        top++;
        arr[top] = data;
        logger.log(Level.INFO, "The data is pushed into the stack.");
    }

    public int pop() {
        if (this.top == -1) {
            logger.log(Level.SEVERE, "Stack Underflow.");
            return -1;
        }

        int deletedValue = arr[top];
        top--;
        logger.log(Level.INFO, "The data is poped from the stack.");
        return deletedValue;
    }

    public void display() {
        if (this.top == -1) {
            logger.log(Level.INFO, "The stack is empty.");
            return;
        }

        int current = top;
        List<Integer> list = new ArrayList<Integer>();
        while (current > -1) {
            list.add(arr[current]);
            current--;
        }

        logger.log(Level.INFO, "The contents of stack are : {0} ", list);
    }

    public int getSize() {
        if (this.top == -1) {
            logger.log(Level.INFO, "The stack is empty.");
            return 0;
        }

        return this.top;
    }

}
