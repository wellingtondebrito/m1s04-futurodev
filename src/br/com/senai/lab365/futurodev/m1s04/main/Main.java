package br.com.senai.lab365.futurodev.m1s04.main;

import br.com.senai.lab365.futurodev.m1s04.models.Arvore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tipo da árvore:");
        String tipoArvore = entrada.nextLine();

        System.out.println("Digite o nome da árvore:");
        String nomeArvore = entrada.nextLine();

        System.out.println("Digite a altura da árvore:");
        double alturaArvore = entrada.nextDouble();



        Arvore arvore = new Arvore(tipoArvore, nomeArvore, alturaArvore);

        arvore.getExibirInformacoes();

        System.out.println("💨 Oxigênio produzido por dia: " + arvore.calculaOxigenio() + " gramas");

    }
}
