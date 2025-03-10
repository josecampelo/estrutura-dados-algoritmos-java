package br.com.josecampelo.estruturadados.vetor.aulas.vetores;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(4);

        Contato contato1 = new Contato("Andre", "1154527854", "andre@email.com");
        Contato contato2 = new Contato("Leandro", "1134526592", "leandro@email.com");
        Contato contato3 = new Contato("David", "1163287854", "david@email.com");
        Contato contato4 = new Contato("Allan", "1121527821", "allan@email.com");
        Contato contato5 = new Contato("Guilherme", "11615782321", "guilherme@email.com");

        vetor.adiciona(contato1);
        vetor.adiciona(contato2);
        vetor.adiciona(contato3);
        vetor.adiciona(contato4);

        System.out.println("Tamanho do vetor é: " + vetor.getTamanho());
        System.out.println(vetor);

        int contato = vetor.busca(contato5);

        if (contato != -1) {
            System.out.println("Contato existe no vetor");
        } else {
            System.out.println("Contato não existe no vetor");
        }
    }
}