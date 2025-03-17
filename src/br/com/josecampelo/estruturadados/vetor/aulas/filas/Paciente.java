package br.com.josecampelo.estruturadados.vetor.aulas.filas;

public class Paciente implements Comparable<Paciente>{

    private String nome;
    private int prioridade;

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "{" + nome + ", " + prioridade + "}";
    }

    @Override
    public int compareTo(Paciente paciente) {
        // Objeto1 > Objeto 2, então retorna 1
        // Objeto1 < Objeto 2, então retorna -1
        // Objeto1 == Objeto 2, então retorna 0

        if (this.prioridade > paciente.prioridade) {
            return 1;
        } else if (this.prioridade < paciente.prioridade) {
            return -1;
        }

        return 0;
    }
}