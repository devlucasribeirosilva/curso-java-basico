package com.loiane.cursojava.exerciciojavaaula15;

import java.util.Scanner;

public class exercicio3 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma das opções do menu, 1 para masculino e 2 para feminino: ");
        int sexo = scan.nextInt();

        if (sexo == 1) {
            System.out.println("Você escolheu masculino");
        } else if (sexo == 2) {
            System.out.println("Você escolheu feminino");
        } else {
            System.out.println("Sexo invalido");
        }

    }
}
