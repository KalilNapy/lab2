package lab2;
/**
 * Representa o descanso de um estudante qualquer (horas descansadas)
 * e os metodos que buscam julgar se um estudante está cansado ou descansado.
 *
 * @author Kalil De Oliveira Napy
 */

public class Descanso {
     /** Total de horas acumuladas de descanso e o numero de semanas contabilizadas. */
    private int horasDescanso;
    private int numeroSemanas;
    /** Serve para registrar as horas de descanso e o numero de semanas.(os dois abaixo) */
    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    public void defineNumeroSemanas(int numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }
    /** Condição para o aluno que registrou as informações: se a quantidade de horas descansadas dividido pelo numero de semanas for
    igual ou superior a 26, ele está descansado, caso contrário, é dado como cansado */
    public String getStatusGeral() {
        if (numeroSemanas == 0) {
            return "Cansado";
        }
        if ((double) horasDescanso / numeroSemanas >= 26) {
            return "Descansado";
        }
        return "Cansado";
    }
}
