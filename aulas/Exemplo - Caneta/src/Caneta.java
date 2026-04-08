public class Caneta {
    String cor;
    float ponta;
    boolean tampada;

    public void status(){
        System.out.println(this.cor);
        System.out.println(this.ponta);
        System.out.println(this.tampada);
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Impossível rabiscar!");
        } else if(this.tampada == false) {
            System.out.println("Rabiscando...");
        }
    }

    public void espaço() {
        System.out.println("===========");
    }
}