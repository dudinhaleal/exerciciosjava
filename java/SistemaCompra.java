import java.util.Scanner;
public class SistemaCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o valor total da compra: ");
        double totalCompra = scanner.nextDouble();
        double desconto;
        if (totalCompra > 1000) {
            desconto = totalCompra * 0.10;
        } else {
            desconto = totalCompra * 0.05;
        }
        double totalComDesconto = totalCompra - desconto;
        System.out.println("valor final com desconto: R$" + totalComDesconto);
    }
}

