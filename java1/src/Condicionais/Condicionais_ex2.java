import java.util.Scanner;

class condicionais_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int menor = scanner.nextInt();

        if(num < menor){
            menor = num;
        }

        System.out.println("Digite o terceiro número:");
        num = scanner.nextInt();

        if(num < menor){
            menor = num;
        }

        System.out.print("O menor número é: " + menor);

        scanner.close();
    }
} //Não da pra usar &&, tem que fazer uma "gambiarra"

//Escreva um programa que leia três números inteiros e apresente na tela o menor valor.