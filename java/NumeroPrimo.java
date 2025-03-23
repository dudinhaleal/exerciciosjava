import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um número: ");
        int numero = scanner.nextInt();
        boolean isPrimo = true;
        if (numero <= 1) {
            isPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }
        if (isPrimo) {
            System.out.println("o número é primo.");
        } else {
            System.out.println("o número não é primo.");
        }
    }
}