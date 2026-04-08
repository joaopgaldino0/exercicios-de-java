public class Inicio {
    public static void main(String[] argos) throws Exception {
        Pessoa p1 = new Pessoa();
        p1.nome = "Marcelo";
        p1.idade = 57;
        p1.comer("Maçã");
        p1.pararComer();
        p1.falar();
        p1.status();
    }
}