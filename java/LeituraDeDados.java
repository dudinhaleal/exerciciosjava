import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
        }
    }
}
