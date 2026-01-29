package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class FarenheitParaCelsius {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");

        double temperaturaFarenheit = scan.nextDouble();

        double temperaturaCelsius =  (5*(temperaturaFarenheit-32)/9);

        System.out.println("A temperatura em Celsius é de : " + temperaturaCelsius + " Graus");
    }
}
