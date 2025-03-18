package br.com.josecampelo.estruturadados.vetor.exercicios.pilhas.classes;

public class Livro {
    private String nome;
    private String isbn;
    private int anoLancamento;
    private String autor;

    public Livro(String nome, String isbn, int anoLancamento, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.anoLancamento = anoLancamento;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
                .append("Livro: ").append(this.nome).append(" | ")
                .append("ISBN: ").append(this.isbn).append(" | ")
                .append("Ano de lançamento: ").append(this.anoLancamento).append(" | ")
                .append("Autor: ").append(this.autor);

        return stringBuilder.toString();
    }
}