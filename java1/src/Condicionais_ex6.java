import java.util.Scanner;

class condicionais_ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 9 para vê-lo por extenso.");
        int num = scanner.nextInt();

        switch(num){
            case 0: System.out.print("Zero"); break;
            case 1: System.out.print("Um"); break;
            case 2: System.out.print("Dois"); break;
            case 3: System.out.print("Três"); break;
            case 4: System.out.print("Quatro"); break;
            case 5: System.out.print("Cinco"); break;
            case 6: System.out.print("Seis"); break;
            case 7: System.out.print("Sete"); break;
            case 8: System.out.print("Oito"); break;
            case 9: System.out.print("Nove"); break;
            default: System.out.print("Digite um número válido!");
        }

        scanner.close();
    }
}
