package br.com.josecampelo.estruturadados.vetor.aulas.listas;

import java.util.Random;

public class Aula05 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        Random random = new Random();

        while (lista.getTamanho() <= 10) {
            lista.adiciona(random.nextInt(777));
        }

        System.out.println(lista);
        lista.limpa();
        System.out.println(lista);
    }
}
