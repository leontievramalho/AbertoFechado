package br.edu.catolica.AbertoFechado.Model;

public class Consultor extends Pessoa{
    public double taxaHora;
    public int horasTrabalhadas;


    public Consultor(String nome, int idade, String email, double taxaHora) {
        super(nome, idade, email);
        this.taxaHora = taxaHora;
        this.horasTrabalhadas = 0;
    }
    public void trabalhar(int horas){
        this.horasTrabalhadas += horas;
    }

    public int getHorasAcumuladas() {
        return horasTrabalhadas;
    }

    public void setHorasAcumuladas(int horasAcumuladas) {
        this.horasTrabalhadas = horasAcumuladas;
    }

    public double getTaxaHora() {
        return taxaHora;
    }

    public void setTaxaHora(double taxaHora) {
        this.taxaHora = taxaHora;
    }

    @Override
    public double calcSalarioTotal() {
        return taxaHora*horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Consultor{" +
                "taxaHora=" + taxaHora +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }
}
