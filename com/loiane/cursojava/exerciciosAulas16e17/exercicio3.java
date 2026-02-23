package com.loiane.cursojava.exerciciosAulas16e17;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // --- VALIDAÇÃO DO NOME ---
        System.out.println("Digite o seu nome:");
        String nome = leitor.nextLine();

        // Enquanto o tamanho do nome for 3 ou menos, ele pede de novo
        while (nome.length() <= 3) {
            System.out.println("Erro: O nome precisa ter mais de 3 letras!");
            System.out.println("Digite o nome novamente:");
            nome = leitor.nextLine();
        }

        // --- VALIDAÇÃO DA IDADE ---
        System.out.println("Digite a sua idade:");
        int idade = leitor.nextInt();

        // Se a idade estiver fora de 0 a 150, entra no loop de erro
        while (idade < 0 || idade > 150) {
            System.out.println("Erro: A idade deve estar entre 0 e 150!");
            System.out.print("Digite a idade novamente: ");
            idade = leitor.nextInt();
        }

        // --- VALIDAÇÃO DO SALÁRIO ---
        System.out.println("Digite o seu salário:");
        double salario = leitor.nextDouble();

        while (salario <= 0) {
            System.out.println("Erro: O salário deve ser maior que zero!");
            System.out.print("Digite o salário novamente: ");
            salario = leitor.nextDouble();
        }

        // --- VALIDAÇÃO DO SEXO ---
        System.out.println("Digite o sexo ('f' ou 'm'):");
        String sexo = leitor.next();

        // Aqui usamos o .equals() porque String é um objeto, não um número
        while (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("Erro: Digite apenas 'f' ou 'm'!");
            sexo = leitor.next();
        }

        // --- VALIDAÇÃO DO ESTADO CIVIL ---
        System.out.println("Estado Civil ('s', 'c', 'v', 'd'):");
        String estadoCivil = leitor.next();

        while (!estadoCivil.equals("s") && !estadoCivil.equals("c") &&
                !estadoCivil.equals("v") && !estadoCivil.equals("d")) {
            System.out.println("Erro: Use 's', 'c', 'v' ou 'd'!");
            estadoCivil = leitor.next();
        }

        System.out.println("--- Dados cadastrados com sucesso! ---");
    }
}