package com.loiane.cursojava.exerciciojavaaula15;

import java.util.Scanner;

public class exercicio6 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = scan.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int numero3 = scan.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O numero 1 é maior");
        } if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O numero 2 é maior");
        } if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("O Numero 3 é maior");
        }
    }
}
