package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
    }

    public void cadastraHoras(int horasEstudo) {
        this.horasEstudo = horasEstudo;
    }

    public void cadastraNota(int numeroNota, double valorNota) {
        this.notas[numeroNota - 1] = valorNota;
    }

    private double calculaMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / this.notas.length;
    }

    public boolean aprovado() {
        return calculaMedia() >= 7.0;
    }

    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " "
               + calculaMedia() + " " + java.util.Arrays.toString(this.notas);
    }
}
