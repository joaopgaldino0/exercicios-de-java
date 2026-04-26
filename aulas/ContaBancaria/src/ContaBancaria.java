public class ContaBancaria {
    private String titular;
    private double saldo;


    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }


    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        }
    }


    public double getSaldo() {
        return saldo;
    }


    public String getTitular() {
        return titular;
    }
}