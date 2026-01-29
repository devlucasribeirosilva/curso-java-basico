package com.loiane.cursojava.exercicios;

public class VariaveisETiposPrimitivos {
    static void main(String[] args) {
        /*
        * Pratique a declaração e inicialização de variáveis.

Declaração de Inteiros: Crie uma classe VariaveisInteiras. Declare variáveis para armazenar a idade de 3 pessoas da sua família. Atribua valores a elas e imprima cada uma no console.

Tipos Decimais: Crie uma classe PrecoProdutos. Declare variáveis do tipo double para representar o preço de um computador, um mouse e um teclado. Imprima os valores.

Tipos Booleanos e Char: Declare uma variável boolean chamada temCarteiraMotorista (coloque true ou false) e uma variável char chamada genero ('M', 'F', 'O'). Imprima os valores.*/

        int idade1 = 20;
        int idade2 = 15;
        int idade3 = 65;

        System.out.println(idade1);
        System.out.println(idade2);
        System.out.println(idade3);

        double precoComputador = 3.500;
        double precoMouse = 50.99;
        double precoTeclado = 20.99;

        System.out.println(precoComputador);
        System.out.println(precoMouse);
        System.out.println(precoTeclado);

        boolean temCarteiraMotorista = false;
        char sexo = 'M';

        System.out.println(temCarteiraMotorista);
        System.out.println(sexo);
    }
}
