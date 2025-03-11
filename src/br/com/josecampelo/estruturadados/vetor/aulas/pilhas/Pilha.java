package br.com.josecampelo.estruturadados.vetor.aulas.pilhas;

import br.com.josecampelo.estruturadados.vetor.aulas.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public T topo(){

        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[this.tamanho-1];
    }

    public T desempilha() {

        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[--this.tamanho];
    }
}