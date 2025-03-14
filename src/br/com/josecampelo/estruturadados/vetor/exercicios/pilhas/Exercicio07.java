package br.com.josecampelo.estruturadados.vetor.exercicios.pilhas;

import java.util.Stack;

public class Exercicio07 {
    public static void main(String[] args) {
        // # Exercicio 07: http://goo.gl/Ad5lAe

        imprimeConversao(5);
        imprimeConversao(12);
        imprimeConversao(23);
        imprimeConversao(34);
        imprimeConversao(45);
        imprimeConversao(56);
        imprimeConversao(67);
        imprimeConversao(78);
        imprimeConversao(89);
        imprimeConversao(99);
        imprimeConversao(777);
    }

    private static void imprimeConversao(int decimal) {
        String binario = converteDecimalParaBinario(decimal);

        System.out.println("O decimal " + decimal + " é representado em binário como: " + binario);
    }

    private static String converteDecimalParaBinario(int decimal) {
        if (decimal == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal /= 2;
        }

        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.toString();
    }
}