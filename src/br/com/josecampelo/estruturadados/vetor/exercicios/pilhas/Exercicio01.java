package br.com.josecampelo.estruturadados.vetor.exercicios.pilhas;

import br.com.josecampelo.estruturadados.vetor.aulas.pilhas.Pilha;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // # Exercicio 01: http://goo.gl/Ad5lAe

        Pilha<Integer> pilha = new Pilha<>();
        Scanner entradaUsuario = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            adicionaElemento(entradaUsuario, pilha);
        }

        if (!pilha.estaVazia()) {
            System.out.println("A pilha ainda contém os elementos: " + pilha + " ao final do programa");
            System.out.println("Iniciando o processo de desempilhamento automático...");

            while (!pilha.estaVazia()) {
                System.out.println("Desempilhando: " + pilha.topo());
                pilha.desempilha();
            }

            System.out.println("Pilha desempilhada ao final do programa com sucesso!");
            System.out.println("Programa encerrado!");
        } else {
            System.out.println("Pilha está vazia ao final do programa");
            System.out.println("Programa encerrado!");
        }
    }

    private static boolean verificaParidade(int numero) {
        return numero % 2 == 0;
    }

    private static int capturaEntrada(Scanner entradaUsuario) {
        System.out.println("Qual número inteiro você deseja adicionar a pilha?");

        while (true) {
            try {
                return entradaUsuario.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Só números inteiros são aceitos no programa. Digite corretamente!");

                entradaUsuario.next();
            }
        }
    }

    private static void adicionaElemento(Scanner entradaUsuario, Pilha<Integer> pilha) {
        int numero = capturaEntrada(entradaUsuario);

        if(verificaParidade(numero)) {
            System.out.println("Número " + numero + " é par, número empilhado");
            pilha.empilha(numero);
        } else if (pilha.estaVazia()) {
            System.out.println("A pilha já está vazia, não é possível desempilhar com número impar");
        } else {
            System.out.println("Número " + numero + " é impar, pilha desempilhada");
            pilha.desempilha();
        }
    }
}