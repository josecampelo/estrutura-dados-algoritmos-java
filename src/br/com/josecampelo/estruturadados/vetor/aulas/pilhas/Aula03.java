package br.com.josecampelo.estruturadados.vetor.aulas.pilhas;

public class Aula03 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        if (pilha.estaVazia()) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.println("A pilha não está vazia!");
        }

        pilha.empilha(7);

        if (pilha.estaVazia()) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.println("A pilha não está vazia!");
        }
    }
}