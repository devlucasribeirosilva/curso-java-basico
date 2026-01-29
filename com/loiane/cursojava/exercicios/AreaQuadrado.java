package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class AreaQuadrado {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a área do quadrado: ");
        double quadrado = scan.nextDouble();

        double areaquadrado = quadrado*2;
        System.out.println("O dobro da area deste quadrado é: " + areaquadrado);
    }
}
