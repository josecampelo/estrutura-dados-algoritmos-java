package br.com.josecampelo.estruturadados.vetor.aulas.filas;

import br.com.josecampelo.estruturadados.vetor.aulas.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        this.adiciona(elemento);
    }

    public T espia() {
        return this.elementos[0];
    }

    /*
    public T desenfileira() {

    }
     */
}