// Escreva um algoritmo para calcular e imprimir o salário bruto a ser recebido por um funcionário em um mês. 
// O programa deverá utilizar os seguintes dados:
// a. Número de horas que o funcionário trabalhou no mês.
// b. Valor recebido por hora de trabalho.
// c. Valor do salário família.
// d. Número de filhos com idade menor que 14 anos, para calcular o salário família.

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double horasTrabalhadas, valorHoras, salarioFamilia, numeroFilhos, salarioBruto;
        
        String titulo = "Salário Bruto";
        System.out.println(titulo);

        System.out.println("Informe as horas trabalhadas no mês:");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Informe o valor recebido por horas trabalhadas no mês:");
        valorHoras = sc.nextDouble();

        System.out.println("Informe o valor do salário família:");
        salarioFamilia = sc.nextInt();

        System.out.println("Número de filhos com idade menor que 14 anos:");
        numeroFilhos = sc.nextInt();

        salarioBruto = (horasTrabalhadas * valorHoras) + (salarioFamilia * numeroFilhos);
        System.out.println("O salário bruto do mês é: R$" + salarioBruto);
        sc.close();
    }
}




