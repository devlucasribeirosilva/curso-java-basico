package com.loiane.cursojava.exerciciosAulas16e17;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;

        // Pedimos a nota pela primeira vez
        System.out.print("Digite uma nota entre zero e dez: ");
        nota = scan.nextDouble();

        // Enquanto a nota for menor que 0 OU maior que 10, ela é inválida
        while (nota < 0 || nota > 10) {
            System.out.println("Valor inválido!");
            System.out.print("Por favor, digite uma nota entre zero e dez: ");
            nota = scan.nextDouble();
        }

        // Se saiu do loop, é porque a nota é válida
        System.out.println("Nota registrada com sucesso: " + nota);

        scan.close();
    }
}