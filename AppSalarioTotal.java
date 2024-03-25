// Escreva um algoritmo que leia o salário fixo de um vendedor, o valor total das vendas que ele realizou no mês e o percentual que ele ganha sobre o total das vendas mensais. O algoritmo deve calcular o salário total do vendedor e apresentá-lo na tela.

import java.util.Scanner;

public class AppSalarioTotal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trabalhador salario = new Trabalhador();        

        System.out.println("Salário Total");

        System.out.println("Digite o salário fixo:");
        salario.setSalarioFixo(sc.nextDouble());
        
        System.out.println("Digite o valor total de vendas:");
        salario.setVendas(sc.nextDouble());
        
        System.out.println("Digite o percentual ganho sobre as vendas:");
        salario.setPercentualVendas(sc.nextDouble());
        
        System.out.println("O salário total é: R$" + String.format("%.2f", salario.salarioTotal()));
        sc.close();      
    }
    
}  
