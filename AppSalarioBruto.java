// Escreva um algoritmo para calcular e imprimir o salário bruto a ser recebido por um funcionário em um mês. 
// O programa deverá utilizar os seguintes dados:
// a. Número de horas que o funcionário trabalhou no mês.
// b. Valor recebido por hora de trabalho.
// c. Valor do salário família.
// d. Número de filhos com idade menor que 14 anos, para calcular o salário família.

import java.util.Scanner;

public class AppSalarioBruto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trabalhador trabalhador = new Trabalhador();
    
        System.out.println("Salário Bruto");

        System.out.println("Informe as horas trabalhadas no mês:");
        trabalhador.setHorasTrabalhadas(sc.nextInt());

        System.out.println("Informe o valor recebido por horas trabalhadas no mês:");
        trabalhador.setValorHoras(sc.nextDouble());

        System.out.println("Informe o valor do salário família:");
        trabalhador.setSalarioFamilia(sc.nextDouble());

        System.out.println("Número de filhos com idade menor que 14 anos:");
        trabalhador.setNumeroFilhos(sc.nextInt());
        
        System.out.println("O salário bruto do mês é: R$ " + String.format("%.2f", trabalhador.salarioBruto()));
        sc.close();
    }
}




