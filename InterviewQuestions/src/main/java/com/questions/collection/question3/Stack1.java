package com.questions.collection.question3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack1 {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    Queue<String> queue = new LinkedList<>();

    // Stack - Dingleberry banana apple
    // Queue - fig cherry Eggplant
    stack.push("Apple");
    stack.push("Banana");
    stack.push("Cherry");

    queue.add(stack.pop());
    stack.push("Dingleberry");
    stack.push("Eggplant");

    queue.add("Fig");
    stack.push(queue.remove());

    queue.add(stack.pop());
    queue.add(stack.pop());

    System.out.println(stack);
    System.out.println(queue);
  }
}
