package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class ValorPorHora {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalhou no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioMes = valorHora * horasTrabalhadas;
        System.out.println("Seu salario no mês é de: " + salarioMes + " Reais");

        double inss = salarioMes*0.08;
        double sindicato = salarioMes*0.05;
        double ir = salarioMes*0.11;
        double salarioLiquido = salarioMes - inss - sindicato - ir;
        System.out.println("Seu Salario Liquido é: " + salarioLiquido);
    }
}