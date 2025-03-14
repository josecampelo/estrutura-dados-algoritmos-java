package br.com.josecampelo.estruturadados.vetor.exercicios.pilhas;

import java.util.Stack;

public class Exercicio06 {
    public static void main(String[] args) {
        // # Exercicio 06: http://goo.gl/Ad5lAe

        Stack<Character> parenteses = new Stack<>();

        imprimeResultado("((A+B) ou A+B(", parenteses);
        imprimeResultado(")A+B(-C ou (A+B)) - (C+D", parenteses);
        imprimeResultado("((A + B) + D)", parenteses);

    }

    private static void imprimeResultado(String expressao, Stack<Character> parenteses) {
        boolean resultado = verificaExpressao(expressao, parenteses);

        if (resultado) {
            System.out.println("A expressão matemática possui símbolos balanceados!");
        } else {
            System.out.println("A expressão matemática não possui símbolos balanceados!");
        }
    }

    private static boolean verificaExpressao(String expressao, Stack<Character> parenteses) {
        for (int i = 0; i < expressao.length(); i++) {
            if (expressao.charAt(i) == '(') {
                parenteses.push('(');
            } else if (expressao.charAt(i) == ')') {
                if (parenteses.isEmpty()) {
                    return false;
                } else {
                    parenteses.pop();
                }
            }
        }

        if (parenteses.isEmpty()) {
            return true;
        } else {
            parenteses.clear();
            return false;
        }
    }
}