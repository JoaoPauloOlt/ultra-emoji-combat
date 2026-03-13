package model;

import enums.ResultadoLuta;
import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private static int count = 1;
    private int rounds, id;
    private boolean aprovada = false;

    public Luta(){
        this.id = count++;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2){
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        }
    }

    public void lutar(){
        if (!aprovada){
            System.out.println("A luta não pode acontecer!");
            return;
        }

        System.out.println("===== LUTA #" + id + " =====");
        System.out.println(desafiado.getNome() + " VS " + desafiante.getNome());

        System.out.println("#### DESAFIADO ####");
        desafiado.apresentar();

        System.out.println("#### DESAFIANTE ####");
        desafiante.apresentar();

        Random aleatorio = new Random();
        ResultadoLuta resultado = ResultadoLuta.values()[aleatorio.nextInt(3)];
        System.out.println("===== Resultado da Luta =====");

        switch (resultado){
            case EMPATE:
                System.out.println("Empatou!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                break;

            case DESAFIADO_VENCEU:
                System.out.println("Vitoria do " + desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
                break;

            case DESAFIANTE_VENCEU:
                System.out.println("Vitoria do " + desafiante.getNome());
                desafiante.ganharLuta();
                desafiado.perderLuta();
                break;
        }
        System.out.println("==========================");
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getId() {
        return id;
    }
}
