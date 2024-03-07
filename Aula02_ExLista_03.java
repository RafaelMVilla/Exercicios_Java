
/*
Receber dois números inteiros e informar qual valor lido é o menor e qual é o maior.
 */

 import java.util.Scanner;
public class Aula02_ExLista_03 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        //Leitor de valores
        System.out.println("Digite um número: ");
        int valor1 = leitor.nextInt();

        System.out.println("Digite um número: ");
        int valor2 = leitor.nextInt();
        
        if (valor1 > valor2) {    
            System.out.println("O "+ valor1+" é o maior valor.\n"+"O "+valor2+" é o menor valor.");
        } else if (valor1 < valor2) {
            System.out.println("O "+ valor2+" é o maior valor.\n"+"O "+valor1+" é o menor valor.");
        } else {
            System.out.println("Os números são iguais!");
        }
       

    }
}
