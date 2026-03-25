import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero de horas: ");
        int horas = scanner.nextInt();
        System.out.println("Digite um numero de minutos: ");
        int minutos = scanner.nextInt();
        System.out.println("Digite um numero de segundos: ");
        int segundos = scanner.nextInt();

        int tempototal = (horas * 60 * 60) + (minutos * 60) + segundos;

        System.out.printf("Esse tempo, em segundos, é: %d segundos", tempototal);

        scanner.close();
    }
}

//Escreva um programa que leia horas, minutos e segundos do teclado e apresente o tempo total em
//segundos.