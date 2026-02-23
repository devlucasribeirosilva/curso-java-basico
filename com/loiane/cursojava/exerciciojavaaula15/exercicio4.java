package com.loiane.cursojava.exerciciojavaaula15;

import java.util.Scanner;

public class exercicio4 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = scan.next().charAt(0);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("É uma vogal");
        } else {
            System.out.println("É uma consoante");
        }
    }
}
