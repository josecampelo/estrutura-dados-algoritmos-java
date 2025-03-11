package br.com.josecampelo.estruturadados.vetor.aulas.pilhas;

import java.util.Stack;

public class Aula06 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());
        System.out.println(stack);
        System.out.println(stack.size());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.isEmpty());
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}