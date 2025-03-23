import java.util.Scanner;

public class Media { //classe media
    public static void main(String[] args) { //classe principal (index)
     
        Scanner scanner = new Scanner(System.in); //criação do objeto Scanner atraves da classe Scanner

        System.out.print("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float nota3 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7){
            System.out.println("Aprovado, sua média foi: " + media);
        }
        else{
            System.out.println("Reprovado, sua média foi: " + media);
        }

    scanner.close();
    }
}

