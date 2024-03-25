//  Escreva um algoritmo que receba dois números a partir do teclado. O algoritmo deve imprimir o logaritmo do primeiro número na base representada pelo segundo número.

import java.util.Scanner;

public class AppLogaritmo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculos logaritmo = new Calculos();

        System.out.println("Logaritmo");

        System.out.println("Informe o primeiro número:");
        logaritmo.setNumeroUm(sc.nextDouble());

        System.out.println("Informe o segundo número:");
        logaritmo.setNumeroDois(sc.nextDouble());

        System.out.println("O resultado é: " + String.format("%.2f", logaritmo.calcularLog()));
        sc.close();

    }
}
