package lab2;

import java.util.Arrays;

/**
 * Representa uma disciplina em que o estudante está cursando.
 * Cada disciplina possui nome, horas de estudo acumuladas,
 * quatro notas e o cálculo da média a ser realizado.
 *
 * @author Kalil De Oliveira Napy
 */
public class Disciplina {

    /** Nome da disciplina. */
    private String nomeDisciplina;

    /** Horas totais de estudo da disciplina. */
    private int horasEstudo;

    /** Array criado com o intuito de armazenar as 4 notas registradas pelo aluno. */
    private double[] notas;

    /**
     * Constrói a disciplina definindo seu nome e inicializando o array de 4 notas.
     * 
     * @param nomeDisciplina O nome da disciplina.
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
    }

    /**
     * Acumula as horas dedicadas ao estudo da disciplina.
     * 
     * @param horasEstudo Quantidade de horas a serem adicionadas.
     */
    public void cadastraHoras(int horasEstudo) {
        this.horasEstudo += horasEstudo; // Soma com as horas já cadastradas
    }

    /**
     * Cadastra a nota do aluno em uma posição específica (de 1 a 4).
     * 
     * @param numeroNota Número da nota (1 a 4).
     * @param valorNota  Valor da nota a ser cadastrada.
     */
    public void cadastraNota(int numeroNota, double valorNota) {
        // Subtrai 1 pois o array em Java começa no índice 0
        this.notas[numeroNota - 1] = valorNota;
    }

    /**
     * Calcula a média das 4 notas.
     * 
     * @return a média calculada.
     */
    private double calculaMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / this.notas.length;
    }

    /**
     * Verifica se o aluno foi aprovado.
     * 
     * @return true se aprovado, false caso seja reprovado
     */
    public boolean aprovado() {
        return calculaMedia() >= 7.0;
    }

    /**
     * Retorna a representação em String da disciplina.
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " "
               + calculaMedia() + " " + Arrays.toString(this.notas);
    }
}
