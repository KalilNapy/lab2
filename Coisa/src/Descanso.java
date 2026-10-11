package lab2;

/**
 * Representa o descanso de um estudante qualquer (horas descansadas)
 * e os metodos que buscam julgar se um estudante está cansado ou descansado.
 *
 * @author Kalil De Oliveira Napy
 */
public class Descanso {

    /** Total de horas acumuladas de descanso */
    private int horasDescanso;

    /** Numero de semanas contabilizadas */
    private int numeroSemanas;

    /**
     * Serve para registrar as horas de descanso.
     * 
     * @param horasDescanso o total de horas descansadas
     */
    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    /**
     * Serve para registrar o numero de semanas.
     * 
     * @param numeroSemanas a quantidade de semanas
     */
    public void defineNumeroSemanas(int numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }

    /**
     * Condição para o aluno que registrou as informações: se a quantidade de horas descansadas dividido pelo numero de semanas for
     * igual ou superior a 26, ele está descansado, caso contrário, é dado como cansado
     * 
     * @return "descansado" ou "cansado"
     */
    public String getStatusGeral() {
        if (this.numeroSemanas == 0) {
            return "cansado";
        }
        if ((double) this.horasDescanso / this.numeroSemanas >= 26) {
            return "descansado";
        }
        return "cansado";
    }
}
