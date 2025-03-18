package br.com.josecampelo.estruturadados.vetor.exercicios.filas;

import br.com.josecampelo.estruturadados.vetor.aulas.filas.Fila;
import br.com.josecampelo.estruturadados.vetor.exercicios.filas.classes.Pessoa;
import br.com.josecampelo.estruturadados.vetor.exercicios.filas.classes.Senha;

public class Exercicio02 {
    private static int PRIORIDADE = 3;

    public static void main(String[] args) {
        Fila<Pessoa> fila = new Fila<>();
        Fila<Pessoa> senhaNormal = new Fila<>();
        Fila<Pessoa> senhaPrioritaria = new Fila<>();

        fila.enfileira(new Pessoa("Maria", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Carlos", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Ana", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Pedro", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Sofia", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Lucas", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Isabela", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Miguel", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Laura", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Gabriel", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Fernanda", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Ricardo", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Vanessa", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Diego", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Letícia", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Thiago", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Renata", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Felipe", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Natália", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Bruno", Senha.SENHA_NORMAL));
        fila.enfileira(new Pessoa("Beatriz", Senha.SENHA_PRIORITARIA));
        fila.enfileira(new Pessoa("Rafael", Senha.SENHA_PRIORITARIA));
        fila.enfileira(new Pessoa("Amanda", Senha.SENHA_PRIORITARIA));
        fila.enfileira(new Pessoa("Gustavo", Senha.SENHA_PRIORITARIA));
        fila.enfileira(new Pessoa("Juliana", Senha.SENHA_PRIORITARIA));
        fila.enfileira(new Pessoa("Leonardo", Senha.SENHA_PRIORITARIA));
        fila.enfileira(new Pessoa("Camila", Senha.SENHA_PRIORITARIA));
        fila.enfileira(new Pessoa("Eduardo", Senha.SENHA_PRIORITARIA));
        fila.enfileira(new Pessoa("Patrícia", Senha.SENHA_PRIORITARIA));
        fila.enfileira(new Pessoa("Rodrigo", Senha.SENHA_PRIORITARIA));

        while(!fila.estaVazia()) {
            triagem(fila, senhaNormal, senhaPrioritaria);
        }

        while(!senhaNormal.estaVazia() || !senhaPrioritaria.estaVazia()) {
            atendente(atendimento(senhaNormal, senhaPrioritaria));
        }
    }

    private static Fila<Pessoa> atendimento(Fila<Pessoa> senhaNormal, Fila<Pessoa> senhaPrioritaria) {
        if (senhaPrioritaria.estaVazia()) {
            return senhaNormal;
        } else {
            if (PRIORIDADE > 0) {
                PRIORIDADE--;
                return senhaPrioritaria;
            } else if (senhaPrioritaria.tamanho() <= 3) {
                PRIORIDADE = senhaPrioritaria.tamanho();
                return senhaNormal;
            } else {
                PRIORIDADE = 3;
                return senhaNormal;
            }
        }
    }

    private static void atendente(Fila<Pessoa> fila) {
        System.out.println("Atendente chamando " + fila.espia().getNome() + " da fila de " + fila.espia().getSenha() + "!");
        System.out.println(fila.espia().getNome() + " atendido(a) com sucesso!");
        fila.desenfileira();
        System.out.println("----------------------------------------------------------");
    }

    private static void triagem(Fila<Pessoa> fila, Fila<Pessoa> senhaNormal, Fila<Pessoa> senhaPrioritaria) {
        if (fila.espia().getSenha().equals(Senha.SENHA_NORMAL)) {
            senhaNormal.enfileira(fila.desenfileira());
        } else {
            senhaPrioritaria.enfileira(fila.desenfileira());
        }
    }
}