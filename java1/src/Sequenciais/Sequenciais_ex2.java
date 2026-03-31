import java.util.Scanner;

class sequenciais_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro para ver seu antecessor e sucessor: ");
        int numero = scanner.nextInt();

        System.out.printf("\nEsse é seu antecessor: %d\n", numero - 1);
        System.out.printf("Esse é seu sucessor: %d", numero + 1);

        scanner.close();
    }
}

//Escreva um programa que leia um número inteiro e apresente o seu antecessor e o seu sucessor.