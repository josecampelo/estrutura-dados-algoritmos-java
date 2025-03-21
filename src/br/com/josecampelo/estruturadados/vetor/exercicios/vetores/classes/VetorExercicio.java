package br.com.josecampelo.estruturadados.vetor.exercicios.vetores.classes;

public class VetorExercicio<T> {
    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public VetorExercicio(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

            return true;
        }

        return false;
    }

    public boolean adiciona(int posicao, T elemento) {

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

    public T busca(int posicao) {

        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

    public int busca(T elemento) {

        for (int i = 0; i < this.tamanho; i++) {

            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public boolean remove(int posicao) {

        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }

        this.tamanho--;

        return true;
    }

    public int getTamanho() {
        return this.tamanho;
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

    // Metodo do Exercicio 01
    public boolean contem(T elemento) {
        return this.busca(elemento) != -1;
    }

    // Metodo do Exercicio 02
    public int ultimoIndice(T elemento) {
        for (int i = this.tamanho-1; i >= 0; i--) {

            if(this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    // Metodo do Exercicio 03
    public boolean remove(T elemento) {
        int posicao = this.busca(elemento);

        if (posicao >= 0) {
            this.remove(posicao);

            return true;
        }

        return false;
    }

    // Metodo do Exercicio 04
    public T obtem(int posicao) {
        return this.busca(posicao);
    }

    // Metodo do Exercicio 05
    public void limpar() {

        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }

        this.tamanho = 0;
    }
}