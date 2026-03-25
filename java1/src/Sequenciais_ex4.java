import java.util.Scanner;

class sequenciais_ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a capacidade do tanque em litros?");
        float capacidade_tanque = scanner.nextFloat();
        System.out.println("Quantos litros estão abastecidos no momento?");
        float litros_abastecidos = scanner.nextFloat();
        System.out.println("Quantos km foram percorridos desde o último abastecimento?");
        float kms_percorridos = scanner.nextFloat();

        float consumo_medio = kms_percorridos / litros_abastecidos;
        float autonomia = (capacidade_tanque - litros_abastecidos) * consumo_medio;

        System.out.printf("Consumo medio do veículo: %.1fkm/l\n", consumo_medio);
        System.out.printf("Autonomia do veículo: %.1fkm", autonomia);

        scanner.close();
    }
}

//Escreva um programa que calcule e mostre o consumo médio e a autonomia que um veículo ainda
//teria antes de um abastecimento de combustível. Considere que o veículo sempre seja abastecido
//até encher o tanque e que são fornecidas apenas a capacidade do tanque, a quantidade de litros
//abastecidos e a quilometragem percorrida desde o último abastecimento.