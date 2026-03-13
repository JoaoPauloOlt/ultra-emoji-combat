package model;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    private String nome;
    private List<Luta> lutas;

    public Evento(String nome){
        this.nome = nome;
        this.lutas = new ArrayList<>();
    }

    public void adicionarLuta(Luta luta){
        lutas.add(luta);
    }

    public void realizarEvento(){

        System.out.println("===== EVENTO " + nome + "=====");

        for (Luta luta : lutas){
            luta.lutar();
            System.out.println();
        }

        System.out.println("===== FIM DO EVENTO =====");
    }
}
