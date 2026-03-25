import java.util.Scanner;

class sequenciais_ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do saque? Utilize apenas numeros divisíveis por 5");
        int valor_saque = scanner.nextInt();

        System.out.printf("Notas de 100 recebidas: %d\n", valor_saque / 100);
        valor_saque = valor_saque % 100;
        System.out.printf("Notas de 50 recebidas: %d\n", valor_saque / 50);
        valor_saque = valor_saque % 50;
        System.out.printf("Notas de 20 recebidas: %d\n", valor_saque / 20);
        valor_saque = valor_saque % 20;
        System.out.printf("Notas de 10 recebidas: %d\n", valor_saque / 10);
        valor_saque = valor_saque % 10;
        System.out.printf("Notas de 5 recebidas: %d\n", valor_saque / 5);
        valor_saque = valor_saque % 5;

        scanner.close();
    }
} //Basicamente, o programa descobre quantas notas cabem guarda o resto pra próxima conta.


//Escreva um programa que solicite do usuário o valor de um saque em caixa eletrônico, sendo que
//estarão disponíveis cédulas de 5, 10, 20, 50 e 100. O programa deve apresentar a menor quantidade
//de cédulas possível de acordo com o saque. Exemplos:
//400,00: 4 cédulas de 100, 0 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5.
//350,00: 3 cédulas de 100, 1 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5.
//385,00: 3 cédulas de 100, 1 cédula de 50, 1 cédula de 20, 1 cédula de 10 e 1 cédula de 5.