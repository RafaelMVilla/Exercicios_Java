import java.util.Scanner;

public class Aula_01_Ex_002 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        //Leitura do texto digitado pelo usuário
        System.out.println("Digite um texto: ");
        String texto = leitor.nextLine();
        System.out.println("Texto digitado: " + texto);

        //Leitura de um inteiro digitado pelo usuário
        System.out.println("DIgite um número inteiro: ");
        int numero = leitor.nextInt();
        System.out.println("Número digitado: " + numero);
    }
    
}
