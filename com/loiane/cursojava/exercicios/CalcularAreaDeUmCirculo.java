package com.loiane.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularAreaDeUmCirculo {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Digite o valor do raio do Circulo: ");

        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio,2);

        String areaFormatada = df.format(area);
        System.out.println("A área do circulo com raio " + raio + " é " + areaFormatada);

    }
}
