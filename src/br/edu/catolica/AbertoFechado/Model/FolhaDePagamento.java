package br.edu.catolica.AbertoFechado.Model;

import java.util.ArrayList;

public class FolhaDePagamento {
    public double calcularFolhaDePagamento(ArrayList<Pessoa> listaPessoas){
        double valorTotal = 0;
        for(Pessoa e : listaPessoas){
            valorTotal += e.calcSalarioTotal();
        }
        return valorTotal;
    }
}
