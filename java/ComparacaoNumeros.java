import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("o maior número e: " + num1);
        } else if (num1 < num2) {
            System.out.println("o maior número é: " + num2);
        } else {
            System.out.println("os números são iguais.");
        }

    scanner.close();
    }
}

