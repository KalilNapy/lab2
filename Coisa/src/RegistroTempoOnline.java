package lab2;

/**
 * Registro de tempo online dedicado a uma disciplina.
 * 
 * @author Kalil de Oliveira Napy
 */
public class RegistroTempoOnline {

    /** Guardar o nome da disciplina */
    private String nomeDisciplina;

    /** Guardar o tempo online que foi dedicado */
    private int tempoOnline;

    /** Tempo online que era esperado a ser dedicado */
    private int tempoOnlineEsperado;

    /** 
     * Construtor que recebe o nome da disciplina e o tempo esperado por ela
     * 
     * @param nomeDisciplina o nome da disciplina
     * @param tempoOnlineEsperado a quantidade de horas esperadas
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoOnline = 0;
    }

    /** 
     * Construtor que recebe o nome da disciplina e define 120 horas como o esperado
     * 
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, 120);
    }

    /** 
     * Metodo para adicionar mais tempo no tempoOnline
     * 
     * @param tempo quantidade de horas a adicionar
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }

    /** 
     * Metodo que verifica se atingiu o tempo esperado ou não
     * 
     * @return true se atingiu ou ultrapassou a meta, false caso contrario
     */
    public boolean atingiuMetaTempoOnline() {
        return this.tempoOnline >= this.tempoOnlineEsperado;
    }

    /**
     * Retorna a representacao em String do registro de tempo online.
     * 
     * @return a representacao no formato "DISCIPLINA GASTO/ESPERADO"
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
    }
}
