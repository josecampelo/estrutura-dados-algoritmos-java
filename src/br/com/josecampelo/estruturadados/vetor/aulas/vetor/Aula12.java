package br.com.josecampelo.estruturadados.vetor.aulas.vetor;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Andre");
        nomes.add("Leandro");
        nomes.add("Junior");
        nomes.add("David");
        nomes.add("Allan");
        nomes.add("Guilherme");

        System.out.println("Elementos da lista:");
        System.out.println(nomes);
        System.out.println("Tamanho da lista: " + nomes.size());
        System.out.println("Index que o elemento pertence " + nomes.indexOf("Junior"));
        System.out.println("Adiciona elemento no topo da lista");
        nomes.add(0, "Eduardo");
        System.out.println(nomes);
    }
}