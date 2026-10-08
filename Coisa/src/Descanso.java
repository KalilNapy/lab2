package lab2;
/**
 * Representa o descanso de um estudante qualquer (horas descansadas)
 * e os metodos que buscam julgar se um estudante está cansado ou descansado.
 *
 * @author Kalil De Oliveira Napy
 */

public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    public void defineNumeroSemanas(int numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }

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
