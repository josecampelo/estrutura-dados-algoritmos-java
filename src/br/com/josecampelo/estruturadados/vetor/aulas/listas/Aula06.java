package br.com.josecampelo.estruturadados.vetor.aulas.listas;

public class Aula06 {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Kha'Zix");
        lista.adiciona("Sejuani");
        lista.adiciona("Zac");

        System.out.println("A lista possui " + lista.getTamanho() + " nó(s)");
        System.out.println(lista);

        System.out.println("----------------- Fazer a busca na lista pelo elemento -----------------");
        buscaPersonagemPorNome("Kha'Zix", lista);
        buscaPersonagemPorNome("Yasuo", lista);
        buscaPersonagemPorNome("Sejuani", lista);
        buscaPersonagemPorNome("Viktor", lista);
        buscaPersonagemPorNome("Zac", lista);

        System.out.println("----------------- Fazer a busca na lista pela posição ------------------");
        buscaPersonagemPorPosicao(2, lista);
        buscaPersonagemPorPosicao(0, lista);
        buscaPersonagemPorPosicao(1, lista);
    }

    static void buscaPersonagemPorPosicao(int posicao, ListaEncadeada<String> lista) {
        if (lista.buscaPorPosicao(posicao) != null) {
            System.out.println("Personagem " + lista.buscaPorPosicao(posicao) + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("Erro: A posição fornecida não existe. | Tamanho da lista: " + lista.getTamanho() + " | Posição fornecida: " + posicao);
        }
    }

    static void buscaPersonagemPorNome(String personagem, ListaEncadeada<String> lista) {
        if (lista.buscaPorElemento(personagem) != -1) {
            System.out.println("+ " + personagem + " existe na lista!");
        } else {
            System.out.println("- " + personagem + " não existe na lista!");
        }
    }
}