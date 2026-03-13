package model;

import java.util.ArrayList;
import java.util.List;

public class HistoricoLutas {

    private List<Luta> historico = new ArrayList<>();

    public void registrarLuta(Luta luta){
        historico.add(luta);
    }

    public void mostrarHistorico(){

        System.out.println("===== HISTORICO DE LUTAS =====");

        for (Luta luta : historico){
            System.out.println(luta);
        }
    }
}
