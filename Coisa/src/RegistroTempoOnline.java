package lab2;

/**
 * Gerencia o tempo de estudo dedicado online para uma disciplina.
 * 
 * @author Kalil de Oliveira Napy
 */
public class RegistroTempoOnline {

    private String nomeDisciplina;
    private int tempoPlanejado;
    private int tempoGasto;

    /**
     * Constroi o registro com 120 horas planejadas por padrao.
     * 
     * @param nomeDisciplina nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, 120);
    }

    /**
     * Constroi o registro com tempo planejado especifico.
     * 
     * @param nomeDisciplina nome da disciplina
     * @param tempoOnlineEsperado tempo em horas planejado
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoPlanejado = tempoOnlineEsperado;
        this.tempoGasto = 0;
    }

    /**
     * Adiciona tempo gasto de estudo.
     * 
     * @param tempo horas dedicadas
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoGasto += tempo;
    }

    /**
     * Verifica se a meta de tempo online foi atingida.
     * 
     * @return true se atingiu o tempo planejado, false caso contrario
     */
    public boolean atingoMetaTempoOnline() {
        return this.tempoGasto >= this.tempoPlanejado;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoGasto + "/" + this.tempoPlanejado;
    }
}
