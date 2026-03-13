package model;

import enums.Categoria;
import interfaces.Lutavel;

import java.util.Objects;

public class Lutador implements Lutavel {

    private String nome, nacionalidade;
    private Categoria categoria;
    private int idade;
    private float altura, peso;
    private int vitorias, derrotas, empates;

    public void apresentar(){
        System.out.println("--------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente da " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.altura + "m");
        System.out.println("pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas e");
        System.out.println(this.getEmpates() + " empates!");
    }

    public void ganharLuta(){
        vitorias++;
    }

    public void perderLuta(){
        derrotas++;
    }

    public void empatarLuta(){
        empates++;
    }

    public float getAltura() {
        return altura;
    }

    public Lutador(float altura, int vitorias, int derrotas, int empates, int idade, String nacionalidade, String nome, float peso) {
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.nome = nome;
        this.setPeso(peso);
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso < 52.2){
            categoria = Categoria.INVALIDO;
        } else if (peso <= 70.3) {
            categoria = Categoria.LEVE;
        } else if (peso <=83.9) {
            categoria = Categoria.MEDIO;
        } else if (peso <=120.2) {
            categoria = Categoria.PESADO;
        }else {
            categoria = Categoria.INVALIDO;
        }
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    @Override
    public String toString() {
        return "Lutador{" +
                "nome='" + nome + '\'' +
                ", categoria=" + categoria +
                ", cartel=" + vitorias + "-" + derrotas + "-" + empates +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Lutador lutador = (Lutador) o;
        return idade == lutador.idade && Float.compare(altura, lutador.altura) == 0 && Float.compare(peso, lutador.peso) == 0 && vitorias == lutador.vitorias && derrotas == lutador.derrotas && empates == lutador.empates && Objects.equals(nome, lutador.nome) && Objects.equals(nacionalidade, lutador.nacionalidade) && categoria == lutador.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nacionalidade, categoria, idade, altura, peso, vitorias, derrotas, empates);
    }
}
