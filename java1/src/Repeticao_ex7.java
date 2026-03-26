import java.util.Scanner;

class repeticao_ex7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numerador = 1, denominador = 100;
        float soma = 0;

        System.out.println("Soma de: 1/100 + 2/99 + 3/98 + 4/97 + ... + 100/1:");

        for(int i = 1; i <= 100; i++) {
            soma = soma + (float)numerador / denominador;
            numerador++;
            denominador--;
        }

        System.out.printf("Resultado da soma: %.2f", soma);

        scanner.close();
    }
} //O for basicamente controla o aumento do numerador e a diminuição do denominador, assim a soma sempre será feita
//com ambos tendo os valores corretos.

//Escreva um programa que mostre o resultado da série: 1/100 + 2/99 + 3/98 + 4/97 + ... + 100/1.