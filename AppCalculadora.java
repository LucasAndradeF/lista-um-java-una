// Escreva um algoritmo que, dados três valores, calcule e imprima as médias aritmética, harmônica e geométrica destes valores.

import java.util.Scanner;

public class AppCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculos caluladora = new Calculos();

        System.out.println("Calculadora");

        System.out.println("Digite o primeiro número: ");
        caluladora.setNumeroUm(sc.nextDouble());

        System.out.println("Digite o segundo número: ");
        caluladora.setNumeroDois(sc.nextDouble());

        System.out.println("Digite o terceiro número: ");
        caluladora.setNumeroTres(sc.nextDouble());

        System.out.println(
                "A média aritmética é: " + String.format("%.2f", caluladora.mediaAritmetica(caluladora.getNumeroUm(),
                        caluladora.getNumeroDois(), caluladora.getNumeroTres())));
        System.out.println(
                "A média harmonica é: " + String.format("%.2f", caluladora.mediaHarmonica(caluladora.getNumeroUm(),
                        caluladora.getNumeroDois(), caluladora.getNumeroTres())));
        System.out.println(
                "A média geometrica é: " + String.format("%.2f", caluladora.mediaGeometrica(caluladora.getNumeroUm(),
                        caluladora.getNumeroDois(), caluladora.getNumeroTres())));

        sc.close();
    }
}
