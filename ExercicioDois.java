//  Escreva um algoritmo que leia o preço de um produto a partir do teclado e apresente na tela o valor do produto acrescido de 10% de seu valor original. 
// Exemplo:
// Informe o valor do produto: 50.00
// Novo valor do produto: 55.00
import java.util.Scanner;

public class ExercicioDois {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double numeroUm, valor;

        String titulo = "Valor Final do Produto";
        System.out.println(titulo);
        
        System.out.println("Informe um número");  
        numeroUm = sc.nextInt();

        valor = (numeroUm * 0.10) + numeroUm;
        
        System.out.println("O valor do produto é: " + valor);
        sc.close();
    }
}

