package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }*/

        //barato <= 10
        // 10> <=15 - pedir desconto
        // 15<= valor 17 - pesquisar mais
        System.out.println("digite o valor do item: ");
        double valor = scan.nextDouble();
        
        if (valor <=10) {
            System.out.println("Barato");
        } else if (valor > 10 && valor <= 15) {
            System.out.println("Peedir desconto");
        } else if (valor >=15 && valor <17){
            System.out.println("Pesquisar mais");
        } else {
            System.out.println("Muito Caro");
        }
    }
}
