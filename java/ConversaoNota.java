import java.util.Scanner;
public class ConversaoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota (0-10): ");
        double nota = scanner.nextDouble();
        if (nota >= 9) {
            System.out.println("Conceito: MB (Muito Bom)");
        } else if (nota >= 7) {
            System.out.println("Conceito: B (Bom)");
        } else if (nota >= 5) {
            System.out.println("Conceito: R (Regular)");
        } else {
            System.out.println("Conceito: I (Insuficiente)");
        }
    }
}
