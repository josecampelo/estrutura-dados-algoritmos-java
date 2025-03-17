package br.com.josecampelo.estruturadados.vetor.aulas.filas;

import java.util.LinkedList;
import java.util.Queue;

public class Aula05 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(7);
        fila.add(2);
        fila.add(6);
        fila.add(10);
        fila.add(86);
        fila.add(150);
        fila.add(777);

        System.out.println("- Programa iniciado...");
        System.out.println("----------------------------------------------");

        while (!fila.isEmpty()) {
            System.out.println("Elementos da fila: " + fila);
            System.out.println("Buscando primeiro elemento da fila...");
            System.out.println("Elemento " + fila.peek() + " encontrado");
            System.out.println("Removendo primeiro elemento da fila...");
            System.out.println("Elemento " + fila.remove() + " removido da fila com sucesso!");
            System.out.println("----------------------------------------------");
        }

        System.out.println("- Programa encerrado...");
    }
}