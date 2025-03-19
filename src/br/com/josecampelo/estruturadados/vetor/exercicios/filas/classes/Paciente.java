package br.com.josecampelo.estruturadados.vetor.exercicios.filas.classes;

public class Paciente {
    public static int CONTADOR_PACIENTE = 0;
    private String nome;
    private String prioridade;

    public Paciente(String prioridade) {
        CONTADOR_PACIENTE++;
        this.nome = "Paciente " + CONTADOR_PACIENTE;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public String getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return "[" + nome + ", " + prioridade + "]";
    }
}