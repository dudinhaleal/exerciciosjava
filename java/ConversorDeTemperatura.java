import java.util.Scanner;

public class ConversorDeTemperatura {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        if (scanner.hasNextDouble()) {
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número.");
        }
    }
}
