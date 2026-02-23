package com.loiane.cursojava.exerciciojavaaula15;

import java.util.Scanner;

public class exercicio2 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();

        if (valor >= 0) {
            System.out.println("O valor é posito");
        } else {
            System.out.println("O valor é negativo");
        }
    }
}
