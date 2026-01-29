package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class PesoIdealGeral {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Digite o seu sexo: ");
        String sexo = scan.nextLine();

        double pesoHomens = (72.7*altura)-58;
        double pesoMulheres = (62.1*altura)-44.7;

        System.out.println("Seu peso ideal é: " + pesoHomens);
        System.out.println("Seu peso ideal é: " + pesoMulheres);

        scan.close();
    }
}
