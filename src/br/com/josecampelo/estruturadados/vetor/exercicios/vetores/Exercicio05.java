package br.com.josecampelo.estruturadados.vetor.exercicios.vetores;

import br.com.josecampelo.estruturadados.vetor.exercicios.vetores.classes.VetorExercicio;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
            # Exercicio 05:
            Melhore a classe Vetor e implemente o metodo limpar(), semelhante ao metodo clear() da classe ArrayList
        */

        VetorExercicio<String> personagens = new VetorExercicio<>(5);
        personagens.adiciona("Kha'Zix");
        personagens.adiciona("Zac");
        personagens.adiciona("Sejuani");
        personagens.adiciona("Skarner");
        personagens.adiciona("Jarvan IV");

        System.out.println("Personagens do Vetor: " + personagens + " | Tamanho do vetor: " + personagens.getTamanho());

        if (personagens.getTamanho() > 0) {
            personagens.limpar();
            System.out.println("Vetor foi limpado");
        } else {
            System.out.println("Vetor esta vazio, não há necessidade de limpar");
        }

        System.out.println("Personagens do Vetor: " + personagens + " | Tamanho do vetor: " + personagens.getTamanho());
    }
}
