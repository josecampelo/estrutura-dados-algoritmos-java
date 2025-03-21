package br.com.josecampelo.estruturadados.vetor.aulas.listas;

public class ListaEncadeada<T> {
    private No<T> primeiroNoLista;
    private No<T> ultimoNoLista;
    private int tamanho = 0;
    private final int NAO_ENCONTRADO = -1;

    public int getTamanho() {
        return this.tamanho;
    }

    public void adiciona(T elemento) {
        No<T> novoNo = new No<>(elemento);

        if (this.tamanho == 0) {
            this.primeiroNoLista = novoNo;
        } else {
            this.ultimoNoLista.setProximoNo(novoNo);
        }

        this.ultimoNoLista = novoNo;
        this.tamanho++;
    }

    public void limpa() {
        No<T> atual = this.primeiroNoLista;
        No<T> proximo = this.primeiroNoLista.getProximoNo();

        while (atual.getProximoNo() != null) {
            atual.setElementoNo(null);
            atual.setProximoNo(null);

            atual = proximo;
            proximo = atual.getProximoNo();
        }

        this.primeiroNoLista = null;
        this.ultimoNoLista = null;
        this.tamanho = 0;
    }

    private No<T> buscaNo(int posicao) {
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição não existe");
        }

        No<T> noAtual = this.primeiroNoLista;

        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximoNo();
        }

        return noAtual;
    }

    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElementoNo();
    }

    public int buscaPorElemento(T elemento) {
        No<T> noAtual = this.primeiroNoLista;
        int noPosicaoAtual = 0;

        while (noAtual != null) {
            if (noAtual.getElementoNo().equals(elemento)) {
                return noPosicaoAtual;
            }

            noPosicaoAtual++;
            noAtual = noAtual.getProximoNo();
        }

        return NAO_ENCONTRADO;
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        No<T> atual = this.primeiroNoLista;

        for (int i = 1; i <= this.tamanho; i++) {
            if (i < this.tamanho) {
                builder.append(atual.getElementoNo()).append(", ");
            } else {
                builder.append(atual.getElementoNo()).append("]");
            }

            atual = atual.getProximoNo();
        }

        return builder.toString();
    }
}