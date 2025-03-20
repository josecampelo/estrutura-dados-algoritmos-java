package br.com.josecampelo.estruturadados.vetor.exercicios.filas;

import br.com.josecampelo.estruturadados.vetor.aulas.filas.Fila;
import br.com.josecampelo.estruturadados.vetor.exercicios.filas.classes.Crianca;

import java.util.Random;

public class Exercicio04 {
    private static final int MAX_QUEIMOU = 11;
    private static int CONTADOR_RODADA = 1;

    public static void main(String[] args) {
        // Exercício 4 - http://goo.gl/fFQCDD

        Fila<Crianca> criancas = new Fila<>();
        Fila<Crianca> bola = new Fila<>();
        Fila<Crianca> saiu = new Fila<>();
        Random random = new Random();

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        criaCriancas(criancas);

        while (criancas.tamanho() > 1) {
            System.out.println("RODADA: " + CONTADOR_RODADA + " - CRIANÇAS BRINCANDO: " + criancas + " QUANTIDADE: " + criancas.tamanho());
            batataQuente(random, criancas, bola, saiu);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
            CONTADOR_RODADA++;
        }

        System.out.println(criancas.espia().getNome() + " foi o último que sobrou! Venceu o jogo!");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        statusBatataQuente(criancas, bola, saiu);
    }

    private static void statusBatataQuente(Fila<Crianca> criancas, Fila<Crianca> bola, Fila<Crianca> saiu) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
                .append("CRIANÇAS BRINCANDO: ").append(criancas).append(" QUANTIDADE: ").append(criancas.tamanho())
                .append("\nCRIANÇAS QUE SAÍRAM: ").append(saiu).append(" QUANTIDADE: ").append(saiu.tamanho());

        System.out.println(stringBuilder);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
    }

    private static void batataQuente(Random random, Fila<Crianca> criancas, Fila<Crianca> bola, Fila<Crianca> saiu) {
        int numeroAleatorio = random.nextInt(MAX_QUEIMOU);

        System.out.print("Batata quente: ");

        bola.enfileira(criancas.desenfileira());

        for (int i = numeroAleatorio; i < MAX_QUEIMOU; i++) {
            System.out.print("quente, ");

            criancas.enfileira(bola.desenfileira());
            bola.enfileira(criancas.desenfileira());
        }

        System.out.println("queimou!");
        System.out.println(bola.espia().getNome() + " queimou com a bola na mão! Está eliminada!");
        saiu.enfileira(bola.desenfileira());
    }

    private static void criaCriancas(Fila<Crianca> criancas) {
        criancas.enfileira(new Crianca("Marcos"));
        criancas.enfileira(new Crianca("Juliana"));
        criancas.enfileira(new Crianca("Pedro"));
        criancas.enfileira(new Crianca("Patricia"));
        criancas.enfileira(new Crianca("Junior"));
        criancas.enfileira(new Crianca("Beatriz"));
        criancas.enfileira(new Crianca("Julio"));
        criancas.enfileira(new Crianca("Manuela"));
        criancas.enfileira(new Crianca("Fabio"));
        criancas.enfileira(new Crianca("Ana"));
    }
}