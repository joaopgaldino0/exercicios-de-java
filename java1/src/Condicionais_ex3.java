import java.util.Scanner;

class condicionais_ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        if(num % 2 == 0 && num % 3 ==0){
            System.out.printf("Sim, o número %d é divisível por 2 e por 3!", num);
        } else {
            System.out.printf("Não, o número %d NÃO é divisível por 2 e por 3!", num);
        }

        scanner.close();
    }
}

//Escreva um programa que efetue a leitura de um número inteiro e apresente se esse número é
//divisível por 2 e divisível por 3