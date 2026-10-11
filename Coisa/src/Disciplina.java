package lab2;

import java.util.Arrays;

/**
 * Guarda as informacoes de uma disciplina,
 * como nome, horas de estudo, notas e media.
 * 
 * @author Kalil de Oliveira Napy
 */
public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private double media;
    private int[] pesos;

    /**
     * Construtor para disciplina com 4 notas.
     * 
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this(nomeDisciplina, 4);
    }

    /**
     * Construtor com quantidade de notas personalizada.
     * 
     * @param nomeDisciplina o nome da disciplina
     * @param numNotas quantidade de notas
     */
    public Disciplina(String nomeDisciplina, int numNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[numNotas];
        this.media = 0.0;
        this.pesos = new int[numNotas];

        for (int i = 0; i < numNotas; i++) {
            this.pesos[i] = 1;
        }
    }

    /**
     * Construtor com pesos especificos para media ponderada.
     * 
     * @param nomeDisciplina o nome da disciplina
     * @param numNotas quantidade de notas
     * @param pesosNotas array com os pesos
     */
    public Disciplina(String nomeDisciplina, int numNotas, int[] pesosNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[numNotas];
        this.media = 0.0;
        this.pesos = pesosNotas;
    }

    /**
     * Adiciona horas de estudo.
     * 
     * @param horas quantidade de horas
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    /**
     * Registra uma nota e atualiza a media.
     * 
     * @param nota posicao da nota
     * @param valorNota valor da nota
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;

        double soma = 0.0;
        int somaPesos = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        if (somaPesos != 0) {
            media = soma / somaPesos;
        } else {
            media = 0.0;
        }
    }

    /**
     * Retorna se a media e pelo menos 7.
     * 
     * @return true se aprovado, false se reprovado
     */
    public boolean aprovado() {
        return media >= 7.0;
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + horasEstudo + " " 
                + media + " " + Arrays.toString(notas);
    }
}
