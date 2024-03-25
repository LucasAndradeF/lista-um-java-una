// Escreva um algoritmo para calcular os juros compostos de uma aplicação financeira. O algoritmo deve ler o valor do capital a ser aplicado, o prazo de aplicação em meses, a taxa de juros mensal e apresentar na tela o montante a ser recebido.
// OBS: M = C × (1 + i) n , em que M é o montante a ser recebido, C é o capital aplicado, i é a taxa de juros e n é o prazo da aplicação.

import java.util.Scanner;

public class AppJuros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculos aplicacaoFinanceira = new Calculos();

        System.out.println("Calculadora de Juros Compostos");

        System.out.println("Informe o valor do capital investido: ");
        aplicacaoFinanceira.setNumeroUm(sc.nextDouble());

        System.out.println("Informe o prazo de aplicação: ");
        aplicacaoFinanceira.setNumeroDois(sc.nextDouble());

        System.out.println("Informe a taxa de juros mensal: ");
        aplicacaoFinanceira.setNumeroTres(sc.nextDouble());

        System.out.println("O montante a ser recebido é R$: "
                + aplicacaoFinanceira.jurosCompostos(aplicacaoFinanceira.getNumeroUm(),
                        aplicacaoFinanceira.getNumeroTres(), aplicacaoFinanceira.getNumeroDois()));
        sc.close();
    }
}
