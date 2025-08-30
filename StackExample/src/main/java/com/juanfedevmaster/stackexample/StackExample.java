/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.juanfedevmaster.stackexample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author jufeq
 */
public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(4);

        System.out.println("Get value on the Peek: " + stack.peek());
        var peek = stack.pop();
        System.out.println("Get value on the Peek: " + stack.peek());

        Queue<String> queue = new LinkedList<String>();
        queue.offer("Juan");
        queue.offer("Camilo");
        queue.offer("Daniela");
        
        System.out.println("====================================");
        
        System.out.println("Get value on the Peek: " + queue.peek());
        var peekQueue = queue.poll();
        System.out.println("Get value on the Peek: " + queue.peek());

    }
}
