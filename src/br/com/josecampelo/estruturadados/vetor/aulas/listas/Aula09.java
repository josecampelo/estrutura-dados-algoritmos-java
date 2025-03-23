package br.com.josecampelo.estruturadados.vetor.aulas.listas;

public class Aula09 {
    public static void main(String[] args) {
        ListaEncadeada<String> personagens = new ListaEncadeada<>();

        personagens.adiciona("Kha'Zix");
        personagens.adiciona("Zac");
        personagens.adiciona("Sejuani");
        personagens.adiciona("Skarner");
        personagens.adiciona("Yasuo");
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());

        System.out.println("Personagem removido: " + personagens.removeUltimoNo());
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());

        System.out.println("Personagem removido: " + personagens.removeUltimoNo());
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());

        System.out.println("Personagem removido: " + personagens.removeUltimoNo());
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());

        System.out.println("Personagem removido: " + personagens.removeUltimoNo());
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());

        System.out.println("Personagem removido: " + personagens.removeUltimoNo());
        System.out.println(personagens + " | Tamanho: " + personagens.getTamanho());
    }
}