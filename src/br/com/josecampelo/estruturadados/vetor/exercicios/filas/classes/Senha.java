package br.com.josecampelo.estruturadados.vetor.exercicios.filas.classes;

public enum Senha {
    SENHA_PRIORITARIA(1),
    SENHA_NORMAL(2);

    private final int prioridade;

    Senha(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getPrioridade() {
        return this.prioridade;
    }
}