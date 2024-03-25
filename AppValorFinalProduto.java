
//  Escreva um algoritmo que leia o preço de um produto a partir do teclado e apresente na tela o valor do produto acrescido de 10% de seu valor original. 
// Exemplo:
// Informe o valor do produto: 50.00
// Novo valor do produto: 55.00
import java.util.Scanner;

public class AppValorFinalProduto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculos calculos = new Calculos();

        System.out.println("Valor Final do Produto");

        System.out.println("Informe o valor do produto: ");
        calculos.setNumeroUm(sc.nextDouble());

        double valor = calculos.valorProduto();

        System.out.println("Novo valor do produto: R$" + String.format("%.2f", valor));
        sc.close();
    }
}
