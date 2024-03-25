// Escreva um algoritmo que receba um número inteiro de segundos a partir do teclado e imprima na tela a quantidade correspondente em horas, minutos e segundos.

import java.util.Scanner;

public class AppHoras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculos hora = new Calculos();

        System.out.println("Conversor de Segundos");
        System.out.println("Digite a quantidade de segundos:");
        hora.segundos(sc.nextInt());
        
        sc.close();
    }
}
