package br.com.josecampelo.estruturadados.vetor.aulas.filas;

public class Aula06 {
    public static void main(String[] args) {
        Fila<Integer> filaNormal = new Fila<>();

        filaNormal.enfileira(7);
        filaNormal.enfileira(17);
        filaNormal.enfileira(3);
        filaNormal.enfileira(163);
        filaNormal.enfileira(12);
        filaNormal.enfileira(1736);
        filaNormal.enfileira(777);

        System.out.println("Fila de números normal:");
        System.out.println(filaNormal);
        System.out.println();

        FilaPrioridade<Integer> filaPrioridade = new FilaPrioridade<>();

        filaPrioridade.enfileira(7);
        filaPrioridade.enfileira(17);
        filaPrioridade.enfileira(3);
        filaPrioridade.enfileira(163);
        filaPrioridade.enfileira(12);
        filaPrioridade.enfileira(1736);
        filaPrioridade.enfileira(777);

        System.out.println("Fila de números com prioridade:");
        System.out.println(filaPrioridade);
        System.out.println();

        Fila<Paciente> filaPacientesNormal = new Fila<>();

        filaPacientesNormal.enfileira(new Paciente("Idoso", 2));
        filaPacientesNormal.enfileira(new Paciente("Adulto", 3));
        filaPacientesNormal.enfileira(new Paciente("Muito Idoso", 1));
        filaPacientesNormal.enfileira(new Paciente("Grávida", 2));
        filaPacientesNormal.enfileira(new Paciente("PcD", 2));
        filaPacientesNormal.enfileira(new Paciente("Jovem", 3));
        filaPacientesNormal.enfileira(new Paciente("Adulto com bebe", 2));

        System.out.println("Fila de pacientes normal");
        System.out.println(filaPacientesNormal);
        System.out.println();

        FilaPrioridade<Paciente> filaPacientesPrioridade = new FilaPrioridade<>();

        filaPacientesPrioridade.enfileira(new Paciente("Idoso", 2));
        filaPacientesPrioridade.enfileira(new Paciente("Adulto", 3));
        filaPacientesPrioridade.enfileira(new Paciente("Muito Idoso", 1));
        filaPacientesPrioridade.enfileira(new Paciente("Grávida", 2));
        filaPacientesPrioridade.enfileira(new Paciente("PcD", 2));
        filaPacientesPrioridade.enfileira(new Paciente("Jovem", 3));
        filaPacientesPrioridade.enfileira(new Paciente("Adulto com bebe", 2));

        System.out.println("Fila de pacientes com prioridade");
        System.out.println(filaPacientesPrioridade);
    }
}