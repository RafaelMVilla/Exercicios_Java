/*
 * Escrever um algoritmo que receba a altura e a largura de um retângulo e calcule a sua área
 */


import java.util.Scanner;

public class Aula_01_ExLista_01 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        //Leitura do texto digitado pelo usuário
        System.out.println("Digite a altura: ");
        float altura = leitor.nextFloat();
        System.out.println("Digite a largura: ");
        float largura = leitor.nextFloat();

        System.out.println("A Área de seu quadrado é de: "+ altura * largura);
        
    }

}
