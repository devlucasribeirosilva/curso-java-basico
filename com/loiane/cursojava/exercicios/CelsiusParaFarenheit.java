package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class CelsiusParaFarenheit {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = scan.nextDouble();

        double temperaturaFarenheit = (temperaturaCelsius*9/5) +32;

        System.out.println("A temperatura em Farenheit é de : " + temperaturaFarenheit + " Graus");
    }

}
