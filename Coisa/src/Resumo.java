package lab2;

/**
 * Representacao de um resumo com tema e conteudo.
 * 
 * @author Kalil de Oliveira Napy
 */
public class Resumo {

    private String tema;
    private String conteudo;

    /**
     * Constroi um resumo a partir do tema e conteudo.
     * 
     * @param tema o tema do resumo
     * @param conteudo o conteudo explicativo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna o tema.
     * 
     * @return o tema
     */
    public String getTema() {
        return this.tema;
    }

    /**
     * Retorna o conteudo.
     * 
     * @return o conteudo
     */
    public String getConteudo() {
        return this.conteudo;
    }

    /**
     * Altera o conteudo do resumo.
     * 
     * @param conteudo novo conteudo
     */
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return this.tema + ": " + this.conteudo;
    }
}
