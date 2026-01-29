package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class LojaTintas {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho em m2 a ser pintado: ");
        double metroQuadrado = scan.nextDouble();

        double litros = metroQuadrado/3;
        double quantidadeLatas = Math.ceil(litros/18);
        double precoTotal = quantidadeLatas*80;

        System.out.println("Você vai precisar de: " + quantidadeLatas + " latas");
        System.out.println("O preço total será: R$ " + precoTotal);




    }
}
