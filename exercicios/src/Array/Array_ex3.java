package Array;
import java.util.Scanner;
import java.util.ArrayList;

class Array_ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> operacoes = new ArrayList<>();

        float saldo_inicial, operacao, creditos = 0, debitos = 0, cpmf, saldo_final;

        System.out.print("Saldo inicial: ");
        saldo_inicial = scanner.nextFloat();

        System.out.print("Operacao: ");
        operacao = scanner.nextFloat();

        /* Alimeta a lista de operacoes */
        while(operacao != 0){
            operacoes.add(operacao);

            System.out.print("Operacao: ");
            operacao = scanner.nextFloat();
        }

        /* Calcula o total de creditos e debitos */
        for(float elemento : operacoes){
            if(elemento > 0){
                creditos += elemento;
            }
            if (elemento < 0){
                debitos += elemento;
            }
        }

        /* Calcula os resultados */
        debitos = debitos * -1;
        cpmf = debitos * 0.004f;
        saldo_final = saldo_inicial + creditos - debitos - cpmf;

        /* Apresenta os resultados */
        System.out.printf("------------------------\n");
        System.out.printf("Creditos.....: R$ %.2f\n", creditos);
        System.out.printf("Debitos......: R$ %.2f\n", debitos);
        System.out.printf("C.P.M.F......: R$ %.2f\n", cpmf);
        System.out.printf("Saldo........: R$ %.2f\n", saldo_final);
        System.out.printf("------------------------\n");

        scanner.close();
    }
}

//Escreva um programa que dado o saldo inicial e uma série de operações de crédito/débito
//adicionadas em uma lista (identificadas com valores positivos ou negativos e finalizada com zero),
//informe o total de créditos, o total de débitos, a C.P.M.F. paga (0,40% do total de débitos) e o saldo
//final da conta, baseado no seguinte exemplo:
//Saldo inicial: 1000.00
//Operação: 200
//Operação: -50
//Operação: -10
//Operação: 170
//Operação: -500
//Operação: 0
//------------------------
//Créditos.....: R$ 370.00
//Débitos......: R$ 560.00
//C.P.M.F......: R$ 2.24
//Saldo........: R$ 807.76
//------------------------