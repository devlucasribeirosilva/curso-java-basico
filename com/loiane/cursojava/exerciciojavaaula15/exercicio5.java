package com.loiane.cursojava.exerciciojavaaula15;

import java.util.Scanner;

public class exercicio5 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota parcial: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota parcial: ");
        double nota2 = scan.nextDouble();

        double notaParcial = (nota1 + nota2)/2;

        if (notaParcial >= 7 ) {
            System.out.println("Aluno aprovado! ");
        } if (notaParcial < 7) {
            System.out.println("Aluno reprovado!");
        } if (notaParcial == 10) {
            System.out.println("Aprovado com distinção!");
        }
    }
}
