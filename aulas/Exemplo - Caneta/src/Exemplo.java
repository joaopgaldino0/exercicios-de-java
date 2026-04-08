public class Exemplo {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = true;
        c1.espaço();
        c1.destampar();
        c1.status();
        c1.rabiscar();
        c1.espaço();

        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.tampada = true;
        c2.status();
        c2.espaço();
    }
}
