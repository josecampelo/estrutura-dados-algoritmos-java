package br.com.josecampelo.estruturadados.vetor.aulas.filas;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula07 {
    public static void main(String[] args) {
        Queue<Integer> fila = new PriorityQueue<>();

        fila.add(7);
        fila.add(312);
        fila.add(2);
        fila.add(32);
        fila.add(3123122);
        fila.add(2369);
        fila.add(777);

        while(!fila.isEmpty()) {
            System.out.println("Elemento " + fila.poll() + " removido da fila");
        }
    }
}