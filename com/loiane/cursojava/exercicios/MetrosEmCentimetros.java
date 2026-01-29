package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class MetrosEmCentimetros {
     static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade em metros para ser convertida em centimetros: ");
        double converteMetros = scan.nextDouble();

        double resultado = converteMetros*100;

        System.out.println("O resultado da conversão é: " + resultado + " Centimetros.");
    }
}
