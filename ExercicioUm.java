// Escreva um algoritmo que leia dois números informados pelo usuário a partir do teclado e que apresente o resultado da média aritmética dos dois números informados.
import java.util.Scanner;

public class ExercicioUm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeroUm, numeroDois, mediaAritmetica;

        String titulo = "Calculadora de Média Aritmética";
        System.out.println(titulo);
        
        System.out.println("Informe o primeiro número: ");
        numeroUm = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        numeroDois = sc.nextInt();
        
        mediaAritmetica = (numeroUm + numeroDois) / 2; 

        System.out.println("A média aritmética é: " + mediaAritmetica);
        
        sc.close();
    }
}
