class repeticao_ex6 {
    public static void main(String[] args){
        int anterior = 1, atual = 1;

        System.out.println("10 primeiros números da sequência de Fibonacci:");
        System.out.print("1\n1\n");

        for(int i = 3; i <= 10; i++){
            atual = atual + anterior;
            anterior = atual - anterior;
            System.out.println(atual);
        }
    }
}

//Escreva um programa que escreva os 10 primeiros números da sequência de Fibonacci (1, 1, 2, 3, 5, 8, 13, 21, 34, 55).