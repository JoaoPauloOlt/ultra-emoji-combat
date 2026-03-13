import model.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Lutador> lutadores = List.of(
                new Lutador(1.75f, 11, 2, 1, 31, "França", "Pretty Boy", 68.9f),
                new Lutador(1.68f, 14, 2, 3, 29, "Brasil", "Putscript", 57.8f),
                new Lutador(1.65f, 12, 2, 1, 35, "EUA", "Snapshadow", 80.9f),
                new Lutador(1.93f, 13, 0, 2, 28, "Austrália", "Dead Core", 81.6f),
                new Lutador(1.70f, 5, 4, 3, 37, "Brasil", "UFOCobol", 119.3f),
                new Lutador(1.81f, 12, 2, 4, 30, "EUA", "Nerdaart", 105.7f)
        );

        Luta luta1 = new Luta();
        luta1.marcarLuta(lutadores.get(0), lutadores.get(1));

        Luta luta2 = new Luta();
        luta2.marcarLuta(lutadores.get(2), lutadores.get(3));

        Evento ufc = new Evento("UEC 01 ");

        ufc.adicionarLuta(luta1);
        ufc.adicionarLuta(luta2);

        ufc.realizarEvento();

        Ranking.mostrarRanking(lutadores);
    }
}