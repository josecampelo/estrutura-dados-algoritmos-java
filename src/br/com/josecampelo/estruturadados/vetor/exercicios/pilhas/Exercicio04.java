package br.com.josecampelo.estruturadados.vetor.exercicios.pilhas;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio04 {

    private static boolean sistemaOnline = true;

    public static void main(String[] args) {
        // # Exercicio 04: http://goo.gl/Ad5lAe

        Stack<Livro> livros = new Stack<>();
        Scanner entradaUsuario = new Scanner(System.in);

        livros.push(new Livro("Duna", "978-0-441-17271-9", 1965, "Frank Herbert"));
        livros.push(new Livro("Neuromancer", "978-0-441-56956-4", 1984, "William Gibson"));
        livros.push(new Livro("Fundação", "978-0-553-29335-7", 1951, "Isaac Asimov"));
        livros.push(new Livro("Admirável Mundo Novo", "978-0-06-085052-4", 1932, "Aldous Huxley"));
        livros.push(new Livro("1984", "978-0-452-28423-4", 1949, "George Orwell"));
        livros.push(new Livro("O Homem do Castelo Alto", "978-0-544-34169-9", 1962, "Philip K. Dick"));

        while (sistemaOnline) {
            mostraMenuOpcoes();
            int opcaoCapturada = capturaOpcaoUsuario(entradaUsuario, 0, 3);
            menuOpcoes(opcaoCapturada, entradaUsuario, livros);
        }

        System.out.println("Programa encerrado com sucesso!");
        entradaUsuario.close();
    }

    private static void limpaPilha(Stack<Livro> livros) {
        for (int i = livros.size() - 1; i >= 0; i--) {
            System.out.println("Removido da pilha -> " + livros.pop());
        }
    }

    private static void encerraPrograma(Stack<Livro> livros) {
        System.out.println("####### SAIR DO PROGRAMA #######");

        if (!livros.isEmpty()) {
            if (livros.size() == 1) {
                System.out.println("Erro: Não é possível sair do programa, pilha ainda possui 1 livro!");
            } else {
                System.out.println("Erro: Não é possível sair do programa, pilha ainda possui " + livros.size() + " livros!");
            }

            System.out.println("# Processo de limpeza da pilha ativado!");

            limpaPilha(livros);

            System.out.println("# Limpeza da pilha executada com sucesso!");
        }

        sistemaOnline = false;
    }

    private static void removeUltimoLivroAdicionado(Scanner entradaUsuario, Stack<Livro> livros) {
        System.out.println("####### REMOVER ÚLTIMO LIVRO ADICIONADO #######");

        while (true) {
            if (!livros.isEmpty()) {
                System.out.println("Removido da pilha -> " + livros.pop());
            } else {
                System.out.println("Erro: Pilha vazia, não é possível remover mais livros!");
                System.out.println("Voltando ao menu de opções...");
                return;
            }

            System.out.println("Deseja remover mais livros?");

            if (repeteOpcao(entradaUsuario, livros) == 0) {
                return;
            }
        }
    }

    private static void buscaUltimoLivroAdicionado(Stack<Livro> livros) {
        System.out.println("####### BUSCAR ÚLTIMO LIVRO ADICIONADO #######");

        if (!livros.isEmpty()) {
            System.out.println("Último livro adicionado na pilha: " + livros.peek());
        } else {
            System.out.println("Erro: Pilha vazia, não é possível buscar o último livro adicionado!");
        }
    }

    private static void adicionaLivro(Scanner entradaUsuario, Stack<Livro> livros) {
        System.out.println("####### ADICIONAR LIVRO #######");

        String nomeLivro;
        String isbnLivro;
        int anoLancamentoLivro;
        String autorLivro;

        while (true) {
            System.out.println("Qual é o nome do livro?");
            nomeLivro = entradaUsuario.nextLine();

            System.out.println("Qual é o ISBN do livro?");
            isbnLivro = entradaUsuario.nextLine();

            while (true) {
                try {
                    System.out.println("Qual é o ano de lançamento do livro?");
                    anoLancamentoLivro = entradaUsuario.nextInt();
                    entradaUsuario.nextLine();
                    break;
                } catch (Exception e){
                    System.out.println("Erro: Apenas números inteiros, digite o ano de lançamento do livro corretamente!");
                    entradaUsuario.next();
                }
            }

            System.out.println("Quem é o autor do livro?");
            autorLivro = entradaUsuario.nextLine();

            livros.push(new Livro(nomeLivro, isbnLivro, anoLancamentoLivro, autorLivro));
            System.out.println("Livro *" + nomeLivro + "* adicionado com sucesso na pilha!");

            System.out.println("Deseja adicionar mais livros?");

            if (repeteOpcao(entradaUsuario, livros) == 0) {
                return;
            }
        }
    }

    private static void menuOpcoes(int opcao, Scanner entradaUsuario, Stack<Livro> livros) {
        switch (opcao) {
            case 1:
                adicionaLivro(entradaUsuario, livros);
                break;
            case 2:
                buscaUltimoLivroAdicionado(livros);
                break;
            case 3:
                removeUltimoLivroAdicionado(entradaUsuario, livros);
                break;
            case 0:
                encerraPrograma(livros);
                break;
        }
    }

    private static int repeteOpcao(Scanner entradaUsuario, Stack<Livro> livros) {
        System.out.println("1 - Sim, repetir opção");
        System.out.println("0 - Não, voltar ao menu");

        return capturaOpcaoUsuario(entradaUsuario, 0, 1);
    }

    private static int capturaOpcaoUsuario(Scanner entradaUsuario, int opcaoMinima, int opcaoMaxima) {
        while(true) {
            try {
                int opcao = entradaUsuario.nextInt();
                entradaUsuario.nextLine();
                if (opcao >= opcaoMinima && opcao <= opcaoMaxima) {
                    return opcao;
                } else {
                    System.out.println("Erro: Só números inteiros de " + opcaoMinima + " a " + opcaoMaxima + " são aceitos no programa. Digite corretamente!");
                }
            } catch (Exception e) {
                System.out.println("Erro: Só números inteiros são aceitos no programa. Digite corretamente!");
                entradaUsuario.next();
            }
        }
    }

    private static void mostraMenuOpcoes() {
        System.out.println("####### CADASTRO DE LIVROS #######");
        System.out.println("1 - Adicionar livro a pilha");
        System.out.println("2 - Buscar último livro adicionado da pilha");
        System.out.println("3 - Remover último livro adicionado da pilha");
        System.out.println("0 - Sair do programa");
    }
}