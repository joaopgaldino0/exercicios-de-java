import java.util.Scanner;

class repeticao_ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        int soma = 0;

        System.out.println("Digite números inteiros para somar, caso queira parar digite 0.");

        do {
            num = scanner.nextInt();
            soma += num;
        } while(num != 0);

        System.out.println("Soma total: " + soma);

        scanner.close();
    }
}

//Escreva um programa que some os números fornecidos pelo usuário até que o número lido seja igual a zero.
//Ao final, mostre o resultado da soma.