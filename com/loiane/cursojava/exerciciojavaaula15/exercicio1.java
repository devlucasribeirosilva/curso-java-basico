package com.loiane.cursojava.exerciciojavaaula15;

import java.util.Scanner;

public class exercicio1 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro Número: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = scan.nextInt();

        if (numero1 > numero2) {
            System.out.println("o número 1 é maior que o numero 2");
        } else {
            System.out.println("o numero 2 é maior que o numero 1");
        }
    }
}
