package br.com.josecampelo.estruturadados.vetor.exercicios;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
            # Exercicio 03:
            Melhore a classe Vetor e implemente o metodo remover(T elemento), semelhante ao metodo remove() da classe ArrayList
        */

        VetorExercicio<String> nomes = new VetorExercicio<>(5);
        nomes.adiciona("Andre");     // 0
        nomes.adiciona("Leandro");   // 1
        nomes.adiciona("Junior");    // 2
        nomes.adiciona("Junior");    // 3
        nomes.adiciona("David");     // 4
        nomes.adiciona("Allan");     // 5
        nomes.adiciona("Guilherme"); // 6

        System.out.println("Nomes que contém no Vetor: " + nomes + " [" + nomes.getTamanho() +"] elementos");
        String nome = "Junior";
        System.out.println("Remover elemento [" + nome + "] do Vetor");
        nomes.remove(nome);
        System.out.println("Nomes que contém no Vetor: " + nomes + " [" + nomes.getTamanho() +"] elementos");
    }
}