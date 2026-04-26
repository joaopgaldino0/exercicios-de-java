public class Conta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João");

        conta.depositar(500);
        System.out.println();
        conta.sacar(200);
        System.out.println();
        conta.sacar(400);
    }
}

//Crie uma classe ContaBancaria com os atributos titular e saldo (inicialmente definido como 0)
//e os métodos depositar e sacar. Não é permitido um saque maior que o saldo.
//
//c1.titular = "Marcelo"
//c1.saldo = 0;
//c1.depositar(500);
//c1.sacar(700);
//c1.sacar(200);