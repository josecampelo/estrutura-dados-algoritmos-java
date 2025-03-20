package br.com.josecampelo.estruturadados.vetor.aulas.listas;

public class ListaEncadeada<T> {
    private No<T> inicio;

    public ListaEncadeada() {
    }

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);
        this.inicio = celula;
    }

    @Override
    public String toString() {
        return "ListaEncadeada[" +
                "inicio=" + inicio +
                ']';
    }
}