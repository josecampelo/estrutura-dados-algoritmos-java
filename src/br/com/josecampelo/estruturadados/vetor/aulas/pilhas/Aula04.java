package br.com.josecampelo.estruturadados.vetor.aulas.pilhas;

public class Aula04 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(10);

        for (int i = 1; i <= 15; i++) {
            pilha.empilha(i * 7);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());

        System.out.println(pilha.topo());
    }
}