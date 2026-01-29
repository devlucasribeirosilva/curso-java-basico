package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class MultaPeixe {
             static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Entrada de dados: Pedir o peso
        System.out.println("João, digite o peso total dos peixes (em Kg): ");
        double peso = scan.nextDouble();

        // 2. Declaração das variáveis de controle
        // Inicializamos com 0, pois o enunciado diz que "caso contrário" deve mostrar ZERO.
        double excesso = 0;
        double multa = 0;

        // Constantes do regulamento (boas práticas para não usar "números mágicos")
        double limitePeso = 50.0;
        double valorMultaPorKg = 4.00;

        // 3. Verificação (Lógica)
        if (peso > limitePeso) {
            // Se o peso for maior que 50, calculamos a diferença
            excesso = peso - limitePeso;
            // E calculamos a multa baseada no excesso
            multa = excesso * valorMultaPorKg;
        }

        // 4. Saída de dados (Relatório)
        // Se não entrou no 'if', as variáveis continuam valendo 0, atendendo ao enunciado.
        System.out.println("--- Relatório de Pesca ---");
        System.out.println("Peso total: " + peso + " kg");
        System.out.printf("Excesso de peso: %.2f kg%n", excesso); // %.2f formata para 2 casas decimais
        System.out.printf("Valor da multa: R$ %.2f%n", multa);

        scan.close();
    }
}