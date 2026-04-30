package Array;
import java.util.ArrayList;
import java.util.Collections;

class Array_ex1 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.add("Fernando");
        nomes.add("Diego");

        System.out.println("Lista padrão:");
        System.out.println(nomes);

        nomes.add("Helena");
        nomes.add(0, "Gustavo");

        System.out.println("\nLista depois da adição de Helena e Gustavo:");
        System.out.println(nomes);

        System.out.println("\nFernando está na lista?");

        if(nomes.contains("Fernando")){
            System.out.println("Sim, está presente na lista.");
        }
        else{
            System.out.println("Não, não está presente na lista.");
        }

        nomes.remove("Ana");
        Collections.sort(nomes);

        System.out.println("\nLista depois da remoção da Ana e ordenação por ordem alfabética:");
        System.out.println(nomes);

        nomes.clear();

        System.out.println("\nLista depois do 'clear':");
        System.out.print(nomes);
    }
}

//Crie uma lista e adicione o nome de 5 pessoas: Carlos, Bruno, Ana, Fernando e Diego. Em seguida:
//Acrescente o nome "Helena" ao final da lista.
//Acrescente o nome "Gustavo" no inicio da lista.
//Verifique se o nome "Fernando" está presente na lista.
//Exclua o nome "Ana" da lista.
//Ordene a lista em ordem crescente.
//Remova todos os nomes da lista.