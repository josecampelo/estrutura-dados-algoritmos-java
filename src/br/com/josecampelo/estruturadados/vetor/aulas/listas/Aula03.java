package br.com.josecampelo.estruturadados.vetor.aulas.listas;

public class Aula03 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);
    }
}