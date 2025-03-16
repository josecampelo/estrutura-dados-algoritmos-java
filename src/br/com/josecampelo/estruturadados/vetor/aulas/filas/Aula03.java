package br.com.josecampelo.estruturadados.vetor.aulas.filas;

public class Aula03 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(7);
        fila.enfileira(2);
        fila.enfileira(6);
        fila.enfileira(10);
        fila.enfileira(86);
        fila.enfileira(150);
        fila.enfileira(777);

        System.out.println(fila);
        System.out.println(fila.espia());
    }
}