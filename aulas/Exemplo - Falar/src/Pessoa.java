public class Pessoa {
    String nome;
    int idade;
    boolean falando = false;
    boolean comendo = false;

    public void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Falando: " + (this.falando ? "Sim" : "Não"));
        System.out.println("Comendo: " + (this.comendo ? "Sim" : "Não"));
    }

    public void falar() {
        if(falando) {
            System.out.println(this.nome + " já está falando");
        } else if(comendo) {
            System.out.println(this.nome + " está comendo");
        } else {
            System.out.println(this.nome + " começou a falar");
        }
        this.falando = true;
    }

    public void pararFalar() {
        this.falando = false;
    }

    public void comer(String alimento) {
        this.comendo = true;
        System.out.println(this.nome + " está comendo " + alimento);
    }

    public void pararComer() {
        this.comendo = false;
    }
}
