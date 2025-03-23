import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o lado 1: ");
        int lado1 = scanner.nextInt();
        System.out.print("digite o lado 2: ");
        int lado2 = scanner.nextInt();
        System.out.print("digite o lado 3: ");
        int lado3 = scanner.nextInt();
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("triangulo Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("triangulo Isósceles.");
            } else {
                System.out.println("triangulo Escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triangulo.");
        }
    }
}
