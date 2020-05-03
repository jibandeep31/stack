package com.jiban.stack.linkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stack {

    private static final Logger logger = Logger.getLogger(Stack.class.getName());

    private StackNode top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(int data) {
        if (this.top == null) {
            logger.log(Level.INFO, "The stack is empty.");
            StackNode node = new StackNode(data);
            this.top = node;
            this.size++;
            logger.log(Level.INFO, "The data is inserted into the stack.");
            return;
        }

        StackNode node = new StackNode(data);
        node.setNext(this.top);
        this.top = node;
        this.size++;
        logger.log(Level.INFO, "The data is inserted into the stack.");
    }

    public StackNode pop() {
        if (this.top == null) {
            logger.log(Level.SEVERE, "Stack Underflow.");
            return null;
        }

        StackNode node = this.top;
        this.top = node.getNext();
        node.setNext(null);
        this.size--;
        logger.log(Level.INFO, "The data is deleted from the stack.");
        return node;
    }

    public void display() {
        if (this.top == null) {
            logger.log(Level.INFO, "The stack is empty.");
            return;
        }

        List<Integer> list = new ArrayList<Integer>();
        StackNode current = this.top;
        while (current != null) {
            list.add(current.getData());
            current = current.getNext();
        }

        logger.log(Level.INFO, "The data in the stack are : {0}", list);
    }

    public int getSize() {
        return this.size;
    }

}
