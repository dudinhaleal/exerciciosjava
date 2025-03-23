import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("olá, " + nome + "! você tem " + idade + " anos.");
        
    }
}
