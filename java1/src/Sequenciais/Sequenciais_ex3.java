import java.util.Scanner;

class sequenciais_ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lata = 0.350;
        double garrafa600 = 0.600;
        int garrafa2 = 2;

        System.out.println("Opções de compra: \nLata de 350ml\nGarrafa de 600ml\nGarrafa de 2L\n");

        System.out.println("Deseja comprar quantas latas?");
        int num_lata = scanner.nextInt();
        System.out.println("Deseja comprar quantas garrafas de 600ml?");
        int num_garrafa600 = scanner.nextInt();
        System.out.println("Deseja comprar quantas garrafas de 2L?");
        int num_garrafa2 = scanner.nextInt();

        double total_ml = (lata * num_lata) + (garrafa600 * num_garrafa600) + (garrafa2 * num_garrafa2);

        System.out.println("Quantidade total de litros comprados: " + total_ml + "L");

        scanner.close();
    }
}

//Uma fabrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml
//e garrafa de 2 litros. Tomando por base que um comerciante compre uma determinada quantidade
//de cada um dos formatos disponíveis, escreva um programa para calcular quantos litros de
//refrigerante ele comprou.