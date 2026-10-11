package lab2;

import java.util.Arrays;

/**
 * Armazena e gerencia os resumos de estudos.
 *
 * @author Kalil de Oliveira Napy
 */
public class RegistroResumos {

    private Resumo[] resumos;
    private int quantidadeResumos;
    private int proximaPosicao;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.quantidadeResumos = 0;
        this.proximaPosicao = 0;
    }

    public void adiciona(String tema, String conteudo) {
        for (int i = 0; i < quantidadeResumos; i++) {
            if (resumos[i].getTema().equalsIgnoreCase(tema)) {
                resumos[i].setConteudo(conteudo);
                return;
            }
        }

        resumos[proximaPosicao] = new Resumo(tema, conteudo);
        proximaPosicao = (proximaPosicao + 1) % resumos.length;

        if (quantidadeResumos < resumos.length) {
            quantidadeResumos++;
        }
    }

    public String[] pegaResumos() {
        String[] copia = new String[quantidadeResumos];
        for (int i = 0; i < quantidadeResumos; i++) {
            copia[i] = resumos[i].toString();
        }
        return copia;
    }

    public String imprimeResumos() {
        String imprimeresumo = "";
        for (int i = 0; i < quantidadeResumos - 1; i++) {
            imprimeresumo += resumos[i].getTema() + " | ";
        }
        if (quantidadeResumos > 0) {
            imprimeresumo += resumos[quantidadeResumos - 1].getTema();
        }
        return "- " + quantidadeResumos + " resumo(s) cadastrado(s)\n- " + imprimeresumo;
    }

    public int conta() {
        return quantidadeResumos;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < quantidadeResumos; i++) {
            if (resumos[i].getTema().equalsIgnoreCase(tema)) {
                return true;
            }
        }
        return false;
    }

    public String[] busca(String chaveDeBusca) {
        String chave = chaveDeBusca.toLowerCase();
        int cont = 0;

        for (int i = 0; i < quantidadeResumos; i++) {
            if (resumos[i].getConteudo().toLowerCase().contains(chave)) {
                cont++;
            }
        }

        String[] achados = new String[cont];
        int pos = 0;

        for (int i = 0; i < quantidadeResumos; i++) {
            if (resumos[i].getConteudo().toLowerCase().contains(chave)) {
                achados[pos] = resumos[i].getTema();
                pos++;
            }
        }

        Arrays.sort(achados);

        return achados;
    }
}
