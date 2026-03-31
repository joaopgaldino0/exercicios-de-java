import java.util.Scanner;

class repeticao_ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;

        System.out.println("Digite um número para saber quantos pares existem entre 1 e ele. ");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
                quantidade++;
            }
        }

        System.out.printf("Foram apresentados %d números!", quantidade);

        scanner.close();
    }
}

//Escreva um programa que mostre todos os números pares existentes entre 1 e um número lido do teclado,
//bem como a quantidade de números apresentados.