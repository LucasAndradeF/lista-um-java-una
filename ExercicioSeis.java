//  Escreva um algoritmo que receba dois números a partir do teclado. O algoritmo deve imprimir o logaritmo do primeiro número na base representada pelo segundo número.


import java.util.Scanner;

public class ExercicioSeis {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double numeroUm, numeroDois, resultado;

        String titulo = "Logaritmo";
        System.out.println(titulo);
        
        System.out.println("Informe o primeiro número:");
        numeroUm = sc.nextInt();
        
        System.out.println("Informe o segundo número:");
        numeroDois = sc.nextInt();
        
        resultado = Math.log(numeroUm) / Math.log(numeroDois);

        System.out.println("O resultado é: " + resultado);
        sc.close();
        
    }
}
