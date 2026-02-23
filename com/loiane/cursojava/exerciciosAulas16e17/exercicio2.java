package com.loiane.cursojava.exerciciosAulas16e17;

import java.util.Scanner;

public class exercicio2 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        String senha;

        System.out.println("Digite o seu nome: " );
        nome = scan.nextLine();

        System.out.println("Digite a sua senha: ");
        senha = scan.nextLine();

        while (senha.equals(nome)) {
            System.out.println("A senha e o nome são iguais");
            System.out.println("Digite a sua senha: ");
            senha = scan.nextLine();
        }

        System.out.println("Senha registrada com sucesso");

    }
}
