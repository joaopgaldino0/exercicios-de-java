class repeticao_ex2 {
    public static void main(String[] args){
        int i;

        System.out.println("Soma dos 100 primeiros números inteiros:");

        for(i = 1; i <= 100; i++) {
            i = i + i;
        }

        System.out.print(i);
    }
}

//Escreva um programa que mostre na tela a soma obtida dos 100 primeiros números inteiros (1 + 2 + 3 + 4 + 5 + ... + 100).