package lab2;

/**
 * Registra e gerencia resumos de estudos com limite fixo.
 * 
 * @author Kalil De Oliveira Napy
 */
public class RegistroResumos {

    /** Array para guardar os temas dos resumos */
    private String[] temas;

    /** Array para guardar o texto dos resumos no formato "Tema: Conteudo" */
    private String[] resumos;

    /** Quantidade atual de resumos armazenados */
    private int quantidadeResumos;

    /** Posição do array onde o próximo resumo será gravado */
    private int proximaPosicao;

    /**
     * Constrói o registro de resumos com um limite máximo.
     * 
     * @param numeroDeResumos a capacidade máxima de resumos
     */
    public RegistroResumos(int numeroDeResumos) {
        this.temas = new String[numeroDeResumos];
        this.resumos = new String[numeroDeResumos];
        this.quantidadeResumos = 0;
        this.proximaPosicao = 0;
    }

    /**
     * Adiciona um novo resumo ou atualiza caso o tema já exista.
     * 
     * @param tema o tema do resumo
     * @param conteudo o texto descritivo do resumo
     */
    public void adiciona(String tema, String conteudo) {
        for (int i = 0; i < this.quantidadeResumos; i++) {
            if (this.temas[i].equalsIgnoreCase(tema)) {
                this.resumos[i] = tema + ": " + conteudo;
                return;
            }
        }

        this.temas[this.proximaPosicao] = tema;
        this.resumos[this.proximaPosicao] = tema + ": " + conteudo;

        if (this.quantidadeResumos < this.temas.length) {
            this.quantidadeResumos++;
        }

        this.proximaPosicao = (this.proximaPosicao + 1) % this.temas.length;
    }

    /**
     * Retorna uma cópia do array contendo apenas os resumos cadastrados.
     * 
     * @return array de String com os resumos
     */
    public String[] pegaResumos() {
        String[] resumosAtuais = new String[this.quantidadeResumos];
        for (int i = 0; i < this.quantidadeResumos; i++) {
            resumosAtuais[i] = this.resumos[i];
        }
        return resumosAtuais;
    }

    /**
     * Retorna a listagem formatada dos resumos cadastrados.
     * 
     * @return String formatada com o total e os temas
     */
    public String imprimeResumos() {
        String resultado = "- " + this.quantidadeResumos + " resumo(s) cadastrado(s)\n- ";

        for (int i = 0; i < this.quantidadeResumos; i++) {
            resultado += this.temas[i];
            if (i < this.quantidadeResumos - 1) {
                resultado += " | ";
            }
        }
        return resultado;
    }

    /**
     * Retorna a quantidade de resumos cadastrados.
     * 
     * @return total de resumos
     */
    public int conta() {
        return this.quantidadeResumos;
    }

    /**
     * Verifica se existe algum resumo cadastrado para o tema informado.
     * 
     * @param tema o tema a ser pesquisado
     * @return true se o resumo existir, false caso contrario
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidadeResumos; i++) {
            if (this.temas[i].equalsIgnoreCase(tema)) {
                return true;
            }
        }
        return false;
    }
}
