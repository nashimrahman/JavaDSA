package collectionFramework.queueInterface;

import java.util.*;
import java.util.Stack;

public class stackDataStructure {
    static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        // Removing
        stack.pop();
        System.out.println(stack);

        //peeking
        System.out.println(stack.peek());




    }
}
