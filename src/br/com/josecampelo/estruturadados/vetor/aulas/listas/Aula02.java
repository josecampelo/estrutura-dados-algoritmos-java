package br.com.josecampelo.estruturadados.vetor.aulas.listas;

public class Aula02 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println(lista);
        System.out.println("Tamanho = " + lista.getTamanho());
    }
}