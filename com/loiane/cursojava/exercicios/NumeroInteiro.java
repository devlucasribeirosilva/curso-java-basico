package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class NumeroInteiro {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = scan.nextInt();
        System.out.println("O número informado foi: " + numero1);
    }
}
