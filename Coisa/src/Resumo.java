package lab2;

/**
 * Representacao de um resumo com tema e conteudo.
 * 
 * @author Kalil de Oliveira Napy
 */
public class Resumo {

    /** Tema do resumo. */
    private String tema;

    /** Conteudo do resumo. */
    private String conteudo;

    /**
     * Constroi um resumo com tema e conteudo.
     * 
     * @param tema o tema do resumo
     * @param conteudo o conteudo do resumo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna o tema do resumo.
     * 
     * @return o tema
     */
    public String getTema() {
        return this.tema;
    }

    /**
     * Retorna o conteudo do resumo.
     * 
     * @return o conteudo
     */
    public String getConteudo() {
        return this.conteudo;
    }

    /**
     * Altera o conteudo do resumo.
     * 
     * @param conteudo o novo conteudo
     */
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * Retorna a representacao em String no formato "Tema: Conteudo".
     * 
     * @return a representacao em String
     */
    @Override
    public String toString() {
        return this.tema + ": " + this.conteudo;
    }
}
