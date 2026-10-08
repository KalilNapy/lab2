package lab2;

public class RegistroTempoOnline {
    /** Guardar o nome da disciplina*/
    private String nomeDisciplina;
    /** Guardar o tempo online que foi dedicado*//
    private int tempoOnline;
    /** Tempo online que era esperado a ser dedicado*//
    private int tempoOnlineEsperado;
    /** Construtor que recebe o nome da disciplina e o tempo esperado por ela*/
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoOnline = 0;
    }
    /** Construtor que recebe o nome da disciplina e define 120 horas como o esperado*/
    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, 120);   // confira o valor padrão no enunciado
    }
    /** Metodo para adicionar mais tempo no tempoOnline*/
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }
    /**Metodo que verifica se atingiu o tempo esperado ou não*/
    public boolean atingiuMetaTempoOnline() {
        return this.tempoOnline >= this.tempoOnlineEsperado;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
    }
}
