// Escreva um algoritmo que leia uma temperatura fornecida pelo usuário a partir do teclado em graus Fahrenheit e a converta para o seu equivalente em graus centígrados.
// OBS.: °C = (°F − 32) / 1,8
import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double numeroUm, grausCelsius;

        String titulo = "Conversor de Temperatura";
        System.out.println(titulo);

        System.out.println("Informe a temperatura em Fahrenheit:");
        numeroUm = sc.nextInt();
        
        grausCelsius = (numeroUm - 32) / 1.8;
        
        System.out.println("A temperatura convertida para graus Celsius é:" + grausCelsius + " °C");
        sc.close();        
    }
}
