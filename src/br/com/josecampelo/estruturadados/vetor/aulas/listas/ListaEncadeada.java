package br.com.josecampelo.estruturadados.vetor.aulas.listas;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    public int getTamanho() {
        return this.tamanho;
    }

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);

        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }

        this.ultimo = celula;
        this.tamanho++;
    }

    public void limpa() {
        No<T> atual = this.inicio;
        No<T> proximo = this.inicio.getProximo();

        while (atual.getProximo() != null) {
            atual.setElemento(null);
            atual.setProximo(null);

            atual = proximo;
            proximo = atual.getProximo();
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        No<T> atual = this.inicio;

        for (int i = 1; i <= this.tamanho; i++) {
            if (i < this.tamanho) {
                builder.append(atual.getElemento()).append(", ");
            } else {
                builder.append(atual.getElemento()).append("]");
            }

            atual = atual.getProximo();
        }

        return builder.toString();
    }
}