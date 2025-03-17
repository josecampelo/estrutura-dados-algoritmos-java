package br.com.josecampelo.estruturadados.vetor.aulas.base;

public abstract class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    @SuppressWarnings("unchecked")
    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    protected boolean adiciona(T elemento) {
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

            return true;
        }

        return false;
    }

    protected boolean adiciona(int posicao, T elemento) {

        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    protected boolean remove(int posicao) {

        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }

        this.tamanho--;

        return true;
    }

    @SuppressWarnings("unchecked")
    private void aumentaCapacidade() {

        if (this.tamanho == this.elementos.length) {
            T[] novosElementos = (T[]) new Object[this.elementos.length * 2];

            for (int i = 0; i < this.tamanho; i++) {
                novosElementos[i] = this.elementos[i];
            }

            this.elementos = novosElementos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }
}