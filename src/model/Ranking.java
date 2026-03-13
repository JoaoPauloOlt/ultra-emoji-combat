package model;

import java.util.Comparator;
import java.util.List;

public class Ranking {

    public static void mostrarRanking(List<Lutador> lutadores){

        System.out.println("===== RANKING =====");

        lutadores.stream().sorted(Comparator.comparing(Lutador::getVitorias).thenComparing(Lutador::getDerrotas).reversed()).forEach(System.out::println);
    }
}
