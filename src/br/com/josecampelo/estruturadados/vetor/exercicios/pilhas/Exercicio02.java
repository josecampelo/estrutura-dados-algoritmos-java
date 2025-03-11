package br.com.josecampelo.estruturadados.vetor.exercicios.pilhas;

import br.com.josecampelo.estruturadados.vetor.aulas.pilhas.Pilha;

import java.util.Scanner;

public class Exercicio02 {

    private static int contador = 0;

    public static void main(String[] args) {
        // # Exercicio 02: http://goo.gl/Ad5lAe

        int quantidadeElementos = 10;
        contador = quantidadeElementos;

        Pilha<Integer> pilhaPar = new Pilha<>(quantidadeElementos);
        Pilha<Integer> pilhaImpar = new Pilha<>(quantidadeElementos);
        Scanner entradaUsuario = new Scanner(System.in);

        for (int i = 1; i <= quantidadeElementos; i++) {
            adicionaElemento(entradaUsuario, pilhaPar, pilhaImpar);
        }

        encerraPrograma(pilhaPar, pilhaImpar);
    }

    private static void encerraPrograma(Pilha<Integer> pilhaPar, Pilha<Integer> pilhaImpar) {
        if (!pilhaPar.estaVazia() || !pilhaImpar.estaVazia()) {
            System.out.println("Erro: Não é possível encerrar o programa");
            System.out.println("A pilha par ou a pilha impar ainda contém elementos ao final do programa");
            System.out.println("Elementos da pilha par: " + pilhaPar);
            System.out.println("Elementos da pilha impar: " + pilhaImpar);
            System.out.println("Iniciando o processo de desempilhamento automático...");

            while (!pilhaPar.estaVazia() || !pilhaImpar.estaVazia()) {
                if (!pilhaPar.estaVazia()) {
                    System.out.println("Desempilhando: " + pilhaPar.topo() + " da pilha par");
                    pilhaPar.desempilha();
                }

                if (!pilhaImpar.estaVazia()) {
                    System.out.println("Desempilhando: " + pilhaImpar.topo() + " da pilha impar");
                    pilhaImpar.desempilha();
                }
            }

            System.out.println("Pilhas desempilhadas ao final do programa com sucesso!");
            System.out.println("Programa encerrado!");
        } else {
            System.out.println("Pilhas estão vazias ao final do programa");
            System.out.println("Programa encerrado!");
        }
    }

    private static boolean verificaParidade(int numero) {
        return numero % 2 == 0;
    }

    private static int capturaEntrada(Scanner entradaUsuario, Pilha<Integer> pilhaPar, Pilha<Integer> pilhaImpar) {
        if (pilhaPar.estaVazia() && pilhaImpar.estaVazia()) {
            System.out.println("Adicione " + contador + " números a pilha par ou pilha impar");
            System.out.println("Qual número inteiro você deseja adicionar?");
        } else {
            System.out.println("Ainda faltam " + contador + " números para adicionar. Qual número inteiro você deseja adicionar?");
        }

        while (true) {
            try {
                return entradaUsuario.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Só números inteiros são aceitos no programa. Digite corretamente!");

                entradaUsuario.next();
            }
        }
    }

    private static void adicionaElemento(Scanner entradaUsuario, Pilha<Integer> pilhaPar, Pilha<Integer> pilhaImpar) {
        int numero = capturaEntrada(entradaUsuario, pilhaPar, pilhaImpar);

        if (numero == 0) {
            if (pilhaPar.estaVazia() || pilhaImpar.estaVazia()) {
                System.out.println("- Erro: Não é possível usar o 0 para desempilhar as duas pilhas, uma ou mais pilhas estão vazias");
            } else {
                System.out.println("Número: " + numero + " foi escolhido, desempilhando a pilha par e a pilha impar!");
                pilhaPar.desempilha();
                pilhaImpar.desempilha();
                --contador;
            }
        }else if (verificaParidade(numero)) {
            System.out.println("- Número " + numero + " é par, número empilhado na pilha par!");
            pilhaPar.empilha(numero);
            --contador;
        } else {
            System.out.println("- Número " + numero + " é impar, número empilhado na pilha impar!");
            pilhaImpar.empilha(numero);
            --contador;
        }
    }
}