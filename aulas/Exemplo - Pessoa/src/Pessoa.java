public class Pessoa {
        String nome;
        int idade;
        float altura;

        public void apresentar(){
            System.out.println("Olá meu nome é " + this.nome + " e tenho " + this.idade + " anos");
            System.out.println();
        }
}