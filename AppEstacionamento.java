// Em um estacionamento há carros e motos. 
// Escreva um algoritmo que solicite ao usuário o total de veículos e o total de rodas. O algoritmo deve determinar quantos carros e quantas motos há no estacionamento. O resultado deve ser apresentado na tela para o usuário.

import java.util.Scanner;

public class AppEstacionamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento();

        System.out.println("Estacionamento");

        System.out.println("Informe o número de veículos no estacionamento:");
        estacionamento.setVeiculos(sc.nextInt());

        System.out.println("Informe a quantidade de rodas:");
        estacionamento.setRodas(sc.nextInt());

        estacionamento.calcularVeiculos();
        
        sc.close();
    }
}
