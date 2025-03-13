package br.com.josecampelo.estruturadados.vetor.exercicios.pilhas;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio05 {
    public static void main(String[] args) {
        // # Exercicio 04: http://goo.gl/Ad5lAe

        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        StringBuilder palavraInversa = new StringBuilder();
        String palavra;

        System.out.println("####### VERIFICA SE PALAVRA É UM PALÍNDROMO #######");
        System.out.print("Digite uma palavra para verificar: ");

        palavra = scanner.next();
        verificaPalavra(palavra, stack, palavraInversa);

        System.out.println("####### SAINDO DO PROGRAMA... ####### ");
        scanner.close();
    }

    private static void verificaPalavra(String palavra, Stack<Character> stack, StringBuilder palavraInversa) {
        for (int i = 0; i <= palavra.length() - 1; i++) {
            stack.push(palavra.charAt(i));
        }

        while (!stack.isEmpty()) {
            palavraInversa.append(stack.pop());
        }

        if (palavraInversa.toString().equalsIgnoreCase(palavra)) {
            System.out.println("A palavra " + palavra + " é um palíndromo!");
            System.out.println("- Palavra lida da esquerda para direita: " + palavra);
            System.out.println("- Palavra lida da direita para esquerda: " + palavraInversa);
        } else {
            System.out.println("Erro: A palavra " + palavra + " não é um palíndromo!");
            System.out.println("- Palavra lida da esquerda para direita: " + palavra);
            System.out.println("- Palavra lida da direita para esquerda: " + palavraInversa);
        }
    }
}