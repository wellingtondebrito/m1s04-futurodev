package br.com.senai.lab365.futurodev.m1s04.models;

public class Arvore {
    private String tipo;
    private String nome;
    private double altura;

    public Arvore(String tipo, String nome, double altura) {
        this.tipo = tipo;
        this.nome = nome;
        this.altura = altura;
    }

    public Arvore(){}

    public double setAltura(double altura) {
        return this.altura = altura;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String setTipo(String tipo) {
        return this.tipo = tipo;
    }

    public void getExibirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Altura: " + this.altura);
    }

    public double calculaOxigenio() {
        return this.altura * 10;
    }
}
