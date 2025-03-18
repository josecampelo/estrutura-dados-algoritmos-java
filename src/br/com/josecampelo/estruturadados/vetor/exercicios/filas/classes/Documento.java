package br.com.josecampelo.estruturadados.vetor.exercicios.filas.classes;

public class Documento {

    private String nome;
    private int quantidadeFolhas;

    public Documento(String nome, int quantidadeFolhas) {
        this.nome = nome;
        this.quantidadeFolhas = quantidadeFolhas;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeFolhas() {
        return quantidadeFolhas;
    }

    @Override
    public String toString() {
        return nome + " com " + quantidadeFolhas + " folhas";
    }
}