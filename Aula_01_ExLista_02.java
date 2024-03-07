
/*
 * Crie um algoritmo que permita fazer três conversões monetárias. O algoritmo deve receber o valor em real (R$) e apresentar os valores convertidos em:
1.
Dólar (1 dólar = 5,17 reais)
2.
Euro (1 euro = 6,14 reais)
3.
Peso argentino (1 peso argentino = 0,05 reais)
 */

import java.util.Scanner;

public class Aula_01_ExLista_02 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        //Leitura dos valores 
        System.out.println("Digite a quantidade de reais: ");
        float dinheiro_real = leitor.nextFloat();

        float dolar = 5.17f;
        float euro = 6.14f;
        float PesoArgentino = 0.05f;


        System.out.println("Seu dinheiro em dólar é: " + dinheiro_real / dolar + "\nSeu dinheiro em Euro é: " + dinheiro_real / euro  + "\nSeu dinheiro em Pesos Argentinos é:"
        + dinheiro_real / PesoArgentino);
        
        
    }
}
