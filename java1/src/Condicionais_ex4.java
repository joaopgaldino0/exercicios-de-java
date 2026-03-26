import java.util.Scanner;

class condicionais_ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        if(num % 2 == 0 || num % 7 == 0){
            System.out.printf("Sim, o número %d é divisível por 2 e/ou por 7!", num);
        } else {
            System.out.printf("Não, o número %d NÃO é divisível por 2 e nem por 7!", num);
        }

        scanner.close();
    }
}

//Escreva um programa que efetue a leitura de um número inteiro e apresente se esse número é
//divisível por 2 ou divisível por 7.