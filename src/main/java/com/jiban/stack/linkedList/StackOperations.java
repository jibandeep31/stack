package com.jiban.stack.linkedList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StackOperations {

    private static final Logger logger = Logger.getLogger(StackOperations.class.getName());

    public static void main(String[] args) {
        Stack stack = new Stack();
        List<Integer> inputs = IntStream
                                    .rangeClosed(1, 7)
                                    .boxed()
                                    .collect(Collectors.toList());

        performBulkInsert(stack, inputs);
        performDisplay(stack);
        logger.log(Level.INFO, "The size of the stack is : {0}", stack.getSize());
        performSingleInsert(stack, 8);
        performDisplay(stack);
        logger.log(Level.INFO, "The size of the stack is : {0}", stack.getSize());

        performDelete(stack);
        performDisplay(stack);
        logger.log(Level.INFO, "The size of the stack is : {0}", stack.getSize());
    }

    public static void performBulkInsert(Stack stack, List<Integer> inputs) {
        inputs
            .stream()
            .forEach(input -> stack.push(input));
    }

    public static void performSingleInsert(Stack stack, int data) {
        stack.push(data);
    }

    public static void performDelete(Stack stack) {
        stack.pop();
    }

    public static void performDisplay(Stack stack) {
        stack.display();
    }

}
