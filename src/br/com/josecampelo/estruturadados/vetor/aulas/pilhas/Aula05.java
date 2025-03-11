package br.com.josecampelo.estruturadados.vetor.aulas.pilhas;

public class Aula05 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(10);

        for (int i = 1; i <= 15; i++) {
            pilha.empilha(i * 7);
        }

        System.out.println(pilha);
        System.out.println("Tamanho da pilha: " + pilha.getTamanho());

        pilha.desempilha();

        System.out.println(pilha);
        System.out.println("Tamanho da pilha: " + pilha.getTamanho());
    }
}