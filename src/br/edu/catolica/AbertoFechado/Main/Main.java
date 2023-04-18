package br.edu.catolica.AbertoFechado.Main;

import br.edu.catolica.AbertoFechado.Model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        Pessoa arielly = new Pessoa("Arielly", 33, "skjdsjdk@jfdkj");
        Gerente leontiev = new Gerente("Leontiev", 27, "akslasklask@dskjd", 3230, 200);
        Empregado jordy = new Empregado("Jordy", 25, "akslasdsdssk@dskjd", 1250);
        Consultor erlon = new Consultor("Erlon", 35, "akslklhjjgklask@dskjd", 50);
        erlon.trabalhar(8);
        listaPessoas.add(arielly);
        listaPessoas.add(leontiev);
        listaPessoas.add(jordy);
        listaPessoas.add(erlon);
        FolhaDePagamento folhaPagamento = new FolhaDePagamento();
        System.out.println(folhaPagamento.calcularFolhaDePagamento(listaPessoas));
    }

}
