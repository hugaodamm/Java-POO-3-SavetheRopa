package com.company.saveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Roupa> roupasNobre = new ArrayList<>();
        List<Roupa> roupasPedro = new ArrayList<>();

        roupasNobre.add(new Roupa("Nike", "Calção"));   // 1
        roupasNobre.add(new Roupa("Nike", "Camiseta")); // 2
        roupasPedro.add(new Roupa("Umbro", "Jaqueta")); // 3
        roupasPedro.add(new Roupa("Umbro", "Calça"));   // 4

        GuardaRoupa guardaRoupa = new GuardaRoupa();

        //acessar a classe depois métodos
        guardaRoupa.guardarRoupas(roupasNobre);
        guardaRoupa.guardarRoupas(roupasPedro);

        guardaRoupa.mostrarRoupas();
        guardaRoupa.devolverRoupas(1);

//      List<Roupa> teste = guardaRoupa.devolverRoupas(1);
//      teste.remove(1);
//      guardaRoupa.guardarRoupas(teste);

        System.out.println("******Depois de Remover******");

        guardaRoupa.mostrarRoupas();

    }
}
