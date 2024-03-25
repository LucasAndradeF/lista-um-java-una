
// Escreva um algoritmo que leia dois números informados pelo usuário a partir do teclado e que apresente o resultado da média aritmética dos dois números informados.
import java.util.Scanner;

public class AppMediaAritmetica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculos media = new Calculos();

        System.out.println("Calculadora de Média Aritmética");

        System.out.println("Informe o primeiro número: ");
        media.setNumeroUm(sc.nextDouble());

        System.out.println("Informe o segundo número: ");
        media.setNumeroDois(sc.nextDouble());

        System.out.println("A média aritmética é: "
                + String.format("%.2f", media.mediaAritmetica(media.getNumeroUm(), media.getNumeroDois())));

        sc.close();
    }
}
