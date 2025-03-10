package br.com.josecampelo.estruturadados.vetor.exercicios.vetores;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
            # Exercicio 02:
            Melhore a classe Vetor e implemente o metodo ultimoIndice, semelhante ao metodo lastIndexOf da classe ArrayList
        */

        VetorExercicio<String> vetorExercicio = new VetorExercicio<>(5);
        vetorExercicio.adiciona("Junior");    // 0
        vetorExercicio.adiciona("Andre");     // 1
        vetorExercicio.adiciona("Junior");    // 2
        vetorExercicio.adiciona("Leandro");   // 3
        vetorExercicio.adiciona("Junior");    // 4
        vetorExercicio.adiciona("David");     // 5
        vetorExercicio.adiciona("Junior");    // 6
        vetorExercicio.adiciona("Allan");     // 7
        vetorExercicio.adiciona("Junior");    // 8
        vetorExercicio.adiciona("Guilherme"); // 9

        String elemento = "Junior";

        System.out.println("Elementos do Vetor: " + vetorExercicio);

        if (vetorExercicio.busca(elemento) > -1) {
            System.out.println("Última ocorrência do elemento: [" + elemento + "]" + " foi no indice: " + vetorExercicio.ultimoIndice(elemento));
        } else {
            System.out.println("Elemento [" + elemento + "] não esta presente no Vetor");
        }
    }
}