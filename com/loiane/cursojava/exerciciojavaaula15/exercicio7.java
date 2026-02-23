package com.loiane.cursojava.exerciciojavaaula15;

import java.util.Scanner;

public class exercicio7 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("--- Verificador de Maior e Menor ---");

        System.out.print("Digite o 1º número: ");
        int n1 = scan.nextInt();

        System.out.print("Digite o 2º número: ");
        int n2 = scan.nextInt();

        System.out.print("Digite o 3º número: ");
        int n3 = scan.nextInt();

        // 2. Lógica para encontrar o MAIOR
        // Começamos assumindo que o n1 é o maior
        int maior = n1;

        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        // 3. Lógica para encontrar o MENOR
        // Começamos assumindo que o n1 é o menor
        int menor = n1;

        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        // 4. Saída de dados
        System.out.println("------------------------------------");
        System.out.println("O MAIOR número é: " + maior);
        System.out.println("O MENOR número é: " + menor);

        scan.close();
    }
}
