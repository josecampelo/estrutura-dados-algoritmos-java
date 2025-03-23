package br.com.josecampelo.estruturadados.vetor.aulas.listas;

import java.util.LinkedList;

public class Aula11 {
    public static void main(String[] args) {
        LinkedList<String> personagensJungle = new LinkedList<>();
        LinkedList<String> personagensMid = new LinkedList<>();
        LinkedList<String> personagensFavoritos = new LinkedList<>();

        personagensJungle.addFirst("Kha'Zix");
        personagensJungle.addLast("Master Yi");
        personagensJungle.addFirst("Zac");
        personagensJungle.addFirst("Warwick");
        personagensJungle.addFirst("Sejuani");
        personagensJungle.addFirst("Amumu");
        personagensJungle.addFirst("Diana");
        System.out.println(personagensJungle);

        personagensMid.add("Veigar");
        personagensMid.add("Xerath");
        personagensMid.add("Diana");
        personagensMid.addLast("Yone");
        personagensMid.add("Mordekaiser");
        personagensMid.add("Karthus");
        personagensMid.add("Morgana");

        System.out.println(personagensMid);

        System.out.println(personagensFavoritos);
        personagensFavoritos.addAll(personagensJungle);
        System.out.println(personagensFavoritos);
        personagensFavoritos.addAll(personagensMid);
        System.out.println(personagensFavoritos);

        System.out.println(personagensFavoritos.removeFirst());
        System.out.println(personagensFavoritos.removeLast());
        System.out.println(personagensFavoritos.remove());
        System.out.println(personagensFavoritos.remove(8));
        System.out.println(personagensFavoritos.contains("Kha'Zix"));
        System.out.println(personagensFavoritos.size());
        System.out.println(personagensFavoritos.isEmpty());
        System.out.println(personagensFavoritos.get(7));
        System.out.println(personagensFavoritos.getFirst());
        System.out.println(personagensFavoritos.getLast());
        System.out.println(personagensFavoritos.peek());

        personagensFavoritos.clear();
        System.out.println(personagensFavoritos);
        System.out.println(personagensMid);
        System.out.println(personagensJungle);

    }
}