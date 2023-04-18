package br.edu.catolica.AbertoFechado.Model;

public class Gerente extends Empregado{
    public double bonus;

    public Gerente(String nome, int idade, String email, double salario, double bonus){
        super(nome, idade, email, salario);
        this.bonus = bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }
    @Override
    public double calcSalarioTotal() {
        return salario+bonus;
    }
    @Override
    public String toString() {
        return "Gerente{" +
                "bonus=" + bonus +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }
}
