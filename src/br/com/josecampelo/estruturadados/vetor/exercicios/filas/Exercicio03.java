package br.com.josecampelo.estruturadados.vetor.exercicios.filas;

import br.com.josecampelo.estruturadados.vetor.aulas.filas.Fila;
import br.com.josecampelo.estruturadados.vetor.exercicios.filas.classes.Paciente;

import java.util.Random;

public class Exercicio03 {
    private static int CONTADOR_ATENDIMENTO = 0;

    public static void main(String[] args) {
        // Exercício 3 - http://goo.gl/fFQCDD

        Fila<Paciente> vermelho = new Fila<>();
        Fila<Paciente> amarelo = new Fila<>();
        Fila<Paciente> verde = new Fila<>();
        Random random = new Random();

        Thread statusThread = new Thread(() -> {
            while (true) {
                statusHospital(verde, amarelo, vermelho);
                try {
                    Thread.sleep(18000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consultaThread = new Thread(() -> {
            while (true) {
                consulta(triagem(verde, amarelo, vermelho));
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread novoPacienteThread = new Thread(() -> {
            while (true) {
                criaPaciente(random, verde, amarelo, vermelho);

                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        statusHospital(verde, amarelo, vermelho);

        for (int i = 6; i > 0; i--) {
            criaPaciente(random, verde, amarelo, vermelho);
        }

        statusThread.start();
        consultaThread.start();
        novoPacienteThread.start();
    }

    private static void personalizaStatus() {
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println();
    }

    private static void statusHospital(Fila<Paciente> verde, Fila<Paciente> amarelo, Fila<Paciente> vermelho) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("      ")
                .append("PACIENTES AGUARDANDO: ")
                .append(Paciente.CONTADOR_PACIENTE - CONTADOR_ATENDIMENTO)
                .append(" | PACIENTES ATENDIDOS: ")
                .append(CONTADOR_ATENDIMENTO)
                .append("\nPRIORIDADE ALTA: ")
                .append(vermelho.tamanho())
                .append(" | PRIORIDADE MÉDIA: ")
                .append(amarelo.tamanho())
                .append(" | PRIORIDADE BAIXA: ")
                .append(verde.tamanho());

        personalizaStatus();
        System.out.println(stringBuilder);
        personalizaStatus();
    }

    private static Fila<Paciente> triagem(Fila<Paciente> verde, Fila<Paciente> amarelo, Fila<Paciente> vermelho) {
        if (!vermelho.estaVazia()) {
            return vermelho;
        } else if (!amarelo.estaVazia()) {
            return amarelo;
        } else {
            return verde;
        }
    }

    private static void consulta(Fila<Paciente> pessoa) {
        System.out.println("[Saída] " + pessoa.espia().getNome() + " de " + pessoa.espia().getPrioridade()+ " foi atendida!");
        personalizaStatus();
        pessoa.desenfileira();
        CONTADOR_ATENDIMENTO++;
    }

    private static void entradaHospital(Paciente paciente) {
        System.out.println("[Entrada] " + paciente.getNome() + " de " + paciente.getPrioridade() + " deu entrada no hospital!");
        personalizaStatus();
    }

    private static void criaPaciente(Random random, Fila<Paciente> verde, Fila<Paciente> amarelo, Fila<Paciente> vermelho) {
        int numeroAleatorio = random.nextInt(10);
        Paciente paciente;

        if (numeroAleatorio == 9) {
            paciente = new Paciente("Prioridade Alta");
            vermelho.enfileira(paciente);
            entradaHospital(paciente);
        } else if (numeroAleatorio >= 6) {
            paciente = new Paciente("Prioridade Média");
            amarelo.enfileira(paciente);
            entradaHospital(paciente);
        } else {
            paciente = new Paciente("Prioridade Baixa");
            verde.enfileira(paciente);
            entradaHospital(paciente);
        }
    }
}