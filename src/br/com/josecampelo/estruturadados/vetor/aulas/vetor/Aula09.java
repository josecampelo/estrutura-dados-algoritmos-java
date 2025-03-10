package br.com.josecampelo.estruturadados.vetor.aulas.vetor;

public class Aula09 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("J");
        System.out.println(vetor);

        vetor.remove(0);
        System.out.println(vetor);

        System.out.println(vetor.remove("Z"));
        System.out.println(vetor);
    }
}