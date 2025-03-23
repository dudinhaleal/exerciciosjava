import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();
        System.out.print("digite a porcentagem de imposto: ");
        double imposto = scanner.nextDouble();
        double salarioLiquido = salarioBruto - (salarioBruto * imposto / 100);
        System.out.println("o seu salário líquido é: R$" + salarioLiquido);
    }
}