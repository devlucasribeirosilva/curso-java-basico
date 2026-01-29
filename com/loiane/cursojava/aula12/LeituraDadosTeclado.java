package com.loiane.cursojava.aula12;
import java.util.Scanner;

public class LeituraDadosTeclado {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       /*String nome = scan.nextLine();
        double numero = scan.nextDouble();*/

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

    }
}
