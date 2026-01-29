package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class CalculoNumeros {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segunto número inteiro: ");
        int numero2 = scan.nextInt();

        System.out.println("Digite um numero real: ");
        double numero3 = scan.nextDouble();

        double resultado1 = (numero1 * 2) * (numero2 / 2);
        System.out.println("O resultado desse produto é: " + resultado1);

        double resultado2 = (numero1*3 + numero3);
        System.out.println("Resultado do segundo produto: " + resultado2);

        double resultado3 = Math.pow(numero3,3);
        System.out.println("Resultado do terceiro produto: " + resultado3);


        scan.close();
    }
}
