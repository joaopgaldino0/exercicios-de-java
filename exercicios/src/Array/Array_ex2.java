package Array;
import java.util.ArrayList;
import java.util.Scanner;

class Array_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            System.out.printf("Informe numero [%d]: ", i);
            int numero = scanner.nextInt();

            numeros.add(numero);

            if(numero % 2 == 0){
                pares.add(numero);
            }
            else{
                impares.add(numero);
            }
        }

        System.out.println("\nNumeros informados: " + numeros);
        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);

        scanner.close();
    }
}

//Crie uma lista que receba 5 números do usuário. Em seguida apresente:
//A lista com os números informados pelo usuário.
//Uma lista com os números pares.
//Uma lista com os números ímpares.