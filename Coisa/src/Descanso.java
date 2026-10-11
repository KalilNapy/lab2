package lab2;

/**
 * Controla e avalia a rotina de descanso do estudante.
 * 
 * @author Kalil de Oliveira Napy
 */
public class Descanso {

    private int horasDescanso;
    private int numeroSemanas;

    /**
     * Inicializa a rotina de descanso.
     */
    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }

    /**
     * Define as horas de descanso.
     * 
     * @param valor quantidade de horas
     */
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    /**
     * Define o numero de semanas.
     * 
     * @param valor quantidade de semanas
     */
    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

    /**
     * Verifica o status de descanso do aluno.
     * 
     * @return "descansado" ou "cansado"
     */
    public String getStatusGeral() {
        if (this.numeroSemanas == 0) {
            return "cansado";
        }

        int mediaHoras = this.horasDescanso / this.numeroSemanas;
        if (mediaHoras >= 26) {
            return "descansado";
        }
        return "cansado";
    }
}
