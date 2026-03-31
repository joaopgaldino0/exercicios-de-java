import java.util.Scanner;

class condicionais_ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.printf("Ordem crescente: %d %d", num2, num1);
        } else if(num2 > num1) {
            System.out.printf("Ordem crescente: %d %d", num1, num2);
        } else {
            System.out.print("Os números são iguais!");
        }

        scanner.close();
    }
}

//Escreva um programa que leia dois números inteiros e os apresente em ordem crescente.
