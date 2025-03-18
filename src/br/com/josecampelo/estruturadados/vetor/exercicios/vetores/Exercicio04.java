package br.com.josecampelo.estruturadados.vetor.exercicios.vetores;

import br.com.josecampelo.estruturadados.vetor.exercicios.vetores.classes.VetorExercicio;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
            # Exercicio 04:
            Melhore a classe Vetor e implemente o metodo obtem(int posicao), semelhante ao metodo get(int posicao) da classe ArrayList
        */

        VetorExercicio<String> personagens = new VetorExercicio<>(5);
        personagens.adiciona("Kha'Zix");
        personagens.adiciona("Zac");
        personagens.adiciona("Sejuani");
        personagens.adiciona("Skarner");
        personagens.adiciona("Jarvan IV");

        System.out.println(personagens);
        System.out.println(personagens.obtem(0));
        System.out.println(personagens.obtem(4));
    }
}
