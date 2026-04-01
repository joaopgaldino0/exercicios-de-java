import java.util.Scanner;

class condicionais_ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de cópias a serem feitas.");
        int num_copias = scanner.nextInt();

        if(num_copias <= 100){
            double valor_copias = num_copias * 0.25;
            System.out.printf("Preço de %.2f reais pelas cópias!", valor_copias);
        } else {
            double valor_excedente = (num_copias - 100) * 0.20;
            num_copias = 100;
            double valor_copias = (num_copias * 0.25) + valor_excedente;
            System.out.printf("Preço de %.2f reais pelas cópias!", valor_copias);
        }

        scanner.close();
    }
}

//Em uma certa papelaria, até 100 folhas, a cópia do xerox custa R$ 0,25 e, acima de 100 folhas, cada
//cópia adicional custa R$ 0,20. Escreva um programa que dado o número total de cópias, informe o
//valor a ser pago.

//Correção do professor (ta melhor) abaixo:
//        if(num_copias <= 100){
//            System.out.printf("O valor a pagar e: %.2f", num_copias * 0.25);
//        }
//        else{
//            System.out.printf("O valor a pagar e: %.2f", (num_copias - 100) * 0.20 + 25);
//        }
//Assim fica bem mais simples do que eu fiz...