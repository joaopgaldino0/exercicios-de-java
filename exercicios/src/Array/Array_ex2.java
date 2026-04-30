package Array;
import java.util.ArrayList;
import java.util.Scanner;

class Array_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        System.out.println("Digite 5 números:");
        for(int i = 1; i <= 5; i++){
            System.out.printf("Informe numero [%d]: ", i);
            numeros.add(scanner.nextInt());
        }

        for(int elemento : numeros){
            if(elemento % 2 == 0){
                pares.add(elemento);
            }
            else{
                impares.add(elemento);
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