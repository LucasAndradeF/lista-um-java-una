// Escreva um algoritmo para calcular os juros compostos de uma aplicação financeira. O algoritmo deve ler o valor do capital a ser aplicado, o prazo de aplicação em meses, a taxa de juros mensal e apresentar na tela o montante a ser recebido.
// OBS: M = C × (1 + i) n , em que M é o montante a ser recebido, C é o capital aplicado, i é a taxa de juros e n é o prazo da aplicação.

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        double capital, prazo, taxa, resultado; 
    
        String titulo = "Calculadora de Juros Compostos";
        System.out.println(titulo);
 
        System.out.println("Informe o valor do capital investido: ");
        capital = sc.nextInt();
    
        System.out.println("Informe o prazo de aplicação: ");
        prazo = sc.nextInt();
   
        System.out.println("Informe a taxa de juros mensal: ");
        taxa = sc.nextInt();
    
        resultado = (capital * Math.pow (1 + taxa, prazo ));
        System.out.println("O montante a ser recebido é R$: " + resultado); 
        sc.close();
    }
} 
