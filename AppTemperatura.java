// Escreva um algoritmo que leia uma temperatura fornecida pelo usuário a partir do teclado em graus Fahrenheit e a converta para o seu equivalente em graus centígrados.
// OBS.: °C = (°F − 32) / 1,8
import java.util.Scanner;

public class AppTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculos temperatura = new Calculos();

        System.out.println("Conversor de Temperatura");

        System.out.println("Informe a temperatura em Fahrenheit:");
        temperatura.setNumeroUm(sc.nextDouble());

        System.out.println("A temperatura convertida para graus Celsius é: " + String.format("%.3f", temperatura.conversorTemperatura()) + " °C");
        sc.close();        
    }
}
