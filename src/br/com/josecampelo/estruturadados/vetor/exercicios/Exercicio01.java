package br.com.josecampelo.estruturadados.vetor.exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
            # Exercicio 01:
            Melhore a classe Vetor e implemente o metodo contem, semelhante ao metodo da classe ArrayList
        */

        VetorExercicio<String> vetorExercicio = new VetorExercicio<>(5);
        vetorExercicio.adiciona("Andre");
        vetorExercicio.adiciona("Leandro");
        vetorExercicio.adiciona("Junior");
        vetorExercicio.adiciona("David");
        vetorExercicio.adiciona("Allan");

        String elemento = "Junior";

        System.out.println("O Vetor possui o elemento: " + elemento + "?");

        if (vetorExercicio.contem(elemento)) {
            System.out.println("Sim, o vetor contém o elemento " + elemento);
        } else {
            System.out.println("Não, o vetor não contém o elemento " + elemento);
        }
    }
}