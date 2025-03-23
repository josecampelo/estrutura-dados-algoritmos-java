package br.com.josecampelo.estruturadados.vetor.aulas.listas;

public class Aula10 {
    public static void main(String[] args) {
        ListaEncadeada<String> personagens = new ListaEncadeada<>();

        personagens.adiciona("Kha'Zix");
        personagens.adiciona("Zac");
        personagens.adiciona("Sejuani");
        personagens.adiciona("Skarner");
        personagens.adiciona("Yasuo");
        personagens.adiciona("Nidalee");
        personagens.adiciona("Jarvan IV");
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());

        System.out.println("\nPersonagem removido: " + personagens.remove(4));
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());

        System.out.println("\nPersonagem removido: " + personagens.remove(0));
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());

        System.out.println("\nPersonagem removido: " + personagens.remove(2));
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());

        System.out.println("\nPersonagem removido: " + personagens.remove(2));
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());

        System.out.println("\nPersonagem removido: " + personagens.remove(2));
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());

        System.out.println("\nPersonagem removido: " + personagens.remove(1));
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());

        System.out.println("\nPersonagem removido: " + personagens.remove(0));
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());
    }
}