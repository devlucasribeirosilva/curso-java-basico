package com.loiane.cursojava.exercicios;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DadosComScanner {
    static void main(String[] args) {
        /*
        * Aqui você interage com o usuário. Lembre-se de importar java.util.Scanner.

O "Papagaio": Crie um programa que pergunte "Qual é o seu nome?". Leia a resposta do usuário usando o Scanner e imprima imediatamente: "Olá, [nome digitado]!".

Cadastro Básico: Crie um programa que peça sequencialmente:

O nome completo (String)

A idade (int)

A altura (double)

Se gosta de Java (boolean)

Desafio: Imprima um relatório final formatado com todas essas informações (ex: "Nome: Fulano | Idade: 20...").*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");

        System.out.println("Qual o seu nome completo?");
        String nome = scan.nextLine();

        System.out.println("Qual a sua idade:  ");
        int idade = scan.nextInt();

        System.out.println("Qual a sua altura?");
        double altura = scan.nextDouble();

        System.out.println("Voce gosta de java? ");
        boolean gostar = scan.nextBoolean();

        System.out.println("Nome: " + nome + "|" + "idade: " + idade + "|" + "altura: " + altura + "|" + "Gosta de Java: " + gostar);

    }
}
