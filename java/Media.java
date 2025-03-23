import java.util.Scanner;

public class Media { //classe media
    public static void main(String[] args) { //classe principal (index)
     
        Scanner scanner = new Scanner(System.in); //criação do objeto Scanner atraves da classe Scanner

        System.out.print("digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("digite a segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.print("digite a terceira nota: ");
        float nota3 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7){
            System.out.println("aprovado, sua média foi: " + media);
        }
        else{
            System.out.println("reprovado, sua média foi: " + media);
        }

    scanner.close();
    }
}

