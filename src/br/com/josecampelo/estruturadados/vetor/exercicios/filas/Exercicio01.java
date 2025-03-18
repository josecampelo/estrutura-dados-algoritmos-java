package br.com.josecampelo.estruturadados.vetor.exercicios.filas;

import br.com.josecampelo.estruturadados.vetor.aulas.filas.Fila;
import br.com.josecampelo.estruturadados.vetor.exercicios.filas.classes.Documento;

public class Exercicio01 {
    public static void main(String[] args) {
        // Exercício 1 - http://goo.gl/fFQCDD

        Fila<Documento> fila = new Fila<>();

        fila.enfileira(new Documento("Contas", 25));
        fila.enfileira(new Documento("Anotações", 70));
        fila.enfileira(new Documento("Material de estudo", 200));
        fila.enfileira(new Documento("Desenhos", 36));
        fila.enfileira(new Documento("Resumo do curso", 93));
        fila.enfileira(new Documento("Calculo matemático", 2));
        fila.enfileira(new Documento("Contas antigas", 19));

        System.out.println("Iniciando programa de imprimir documentos...");
        System.out.println();

        while (!fila.estaVazia()) {
            System.out.println("Imprimindo documento " + proximoDucimento(fila) + "...");
            System.out.println("Documento " + imprimeDocumento(fila) + " imprimido com sucesso!");
            System.out.println("Iniciando a próxima impressão...");
            System.out.println();
        }

        System.out.println("Fila de impressão vazia, encerrando programa...");
    }

    private static Documento proximoDucimento(Fila<Documento> fila) {
        return fila.espia();
    }

    private static Documento imprimeDocumento(Fila<Documento> fila) {
        return fila.desenfileira();
    }
}