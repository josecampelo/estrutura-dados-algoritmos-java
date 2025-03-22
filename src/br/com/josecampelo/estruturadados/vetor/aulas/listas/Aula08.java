package br.com.josecampelo.estruturadados.vetor.aulas.listas;

public class Aula08 {
    public static void main(String[] args) {
        ListaEncadeada<String> letras = new ListaEncadeada<>();
        System.out.println("\nLetras: " + letras + " | Tamanho: " + letras.getTamanho() + " | Posições: " + letras.getTamanho());

        letras.adiciona("A");
        letras.adiciona("B");
        letras.adiciona("C");
        letras.adiciona("D");
        letras.adiciona("E");
        System.out.println("\nLetras: " + letras + " | Tamanho: " + letras.getTamanho() + " | Posições: " + (letras.getTamanho()-1));

        while (!letras.estaVazia()) {
            letras.removePrimeiroNo();
            System.out.println("\nLetras: " + letras + " | Tamanho: " + letras.getTamanho());
        }
    }
}