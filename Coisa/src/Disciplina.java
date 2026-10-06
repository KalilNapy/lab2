package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private int[] notas = new int[4];
    private double valorNota;


    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horasEstudo){
        this.horasEstudo = horasEstudo;
    }

    public void cadastraNota(int notas, double valorNota){
        this.valorNota = valorNota;
    }

    public boolean aprovado(){

    }
}


}
