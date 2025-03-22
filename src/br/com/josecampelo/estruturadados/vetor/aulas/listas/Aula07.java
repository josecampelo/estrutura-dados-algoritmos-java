package br.com.josecampelo.estruturadados.vetor.aulas.listas;

public class Aula07 {
    public static void main(String[] args) {
        ListaEncadeada<String> letras = new ListaEncadeada<>();
        System.out.println("\nLetras: " + letras + " | Tamanho: " + letras.getTamanho() + " | Posições: " + letras.getTamanho());

        letras.adiciona("B");
        letras.adiciona("C");
        letras.adiciona("D");
        letras.adicionaUltimaPosicao("E");
        letras.adicionaPrimeiraPosicao("A");
        System.out.println("\nLetras: " + letras + " | Tamanho: " + letras.getTamanho() + " | Posições: " + (letras.getTamanho()-1));

        // A(0), B(1), C(2), D(3), E(4)
        letras.adiciona(2, "X");
        System.out.println("\nLetras: " + letras + " | Tamanho: " + letras.getTamanho() + " | Posições: " + (letras.getTamanho()-1));
    }
}