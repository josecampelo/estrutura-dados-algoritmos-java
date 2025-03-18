package br.com.josecampelo.estruturadados.vetor.exercicios.filas.classes;

public class Pessoa {
    private String nome;
    private Senha senha;

    public Pessoa(String nome, Senha senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Senha getSenha() {
        return this.senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "[" + this.nome + ", " + this.senha + "]";
    }
}