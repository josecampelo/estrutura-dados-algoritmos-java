package br.com.josecampelo.estruturadados.vetor.aulas;

import br.com.josecampelo.estruturadados.vetor.VetorGenerico;

public class Aula11 {
    public static void main(String[] args) {
        VetorGenerico<Contato> vetorGenerico = new VetorGenerico<>(4);

        Contato contato1 = new Contato("Andre", "1154527854", "andre@email.com");
        Contato contato2 = new Contato("Leandro", "1134526592", "leandro@email.com");
        Contato contato3 = new Contato("David", "1163287854", "david@email.com");
        Contato contato4 = new Contato("Allan", "1121527821", "allan@email.com");
        Contato contato5 = new Contato("Guilherme", "11615782321", "guilherme@email.com");

        vetorGenerico.adiciona(contato1);
        vetorGenerico.adiciona(contato2);
        vetorGenerico.adiciona(contato3);
        vetorGenerico.adiciona(contato4);

        System.out.println(vetorGenerico);
    }
}