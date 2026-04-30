package Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Array_ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<>();

        int opcoes;
        String aluno;

        while(true){ //Aqui o while está sendo utlizado como um sistema, é ele quem define quando o sistema fecha
            System.out.println("\n===== MENU =====");
            System.out.println("[1] Adicionar aluno");
            System.out.println("[2] Listar alunos");
            System.out.println("[3] Buscar aluno");
            System.out.println("[4] Remover aluno");
            System.out.println("[5] Sair");

            System.out.print("\nEscolha uma opcao: ");
            opcoes = scanner.nextInt();

            if(opcoes == 5){
                break;
            }

            switch(opcoes){
                case 1: //Adição de alunos
                    System.out.print("Digite o nome do aluno para adicionar: ");
                    alunos.add(scanner.next());
                    System.out.println("Aluno adicionado com sucesso!");
                    break;

                case 2:
                    if(alunos.size() == 0){ //Forma de ver se o array está vazio
                        System.out.println("Nenhum aluno cadastrado.");
                        break;
                    }

                    Collections.sort(alunos); //Ordenação por ordem alfabética

                    System.out.print("Lista dos alunos cadastrados:\n");

                    for(int i = 0; i < alunos.size(); i++){
                        System.out.printf("%d - %s\n", i + 1, alunos.get(i));
                    }   //Isso aqui é: posição do aluno na lista + nome dele (procurando pelo índice)
                    break;

                case 3:
                    if(alunos.isEmpty()){ //Forma MELHOR de ver se o array está vazio, vem com o import ArrayList
                        System.out.println("Nenhum aluno cadastrado.");
                        break;
                    }

                    System.out.print("Digite o nome do aluno para buscar: ");
                    aluno = scanner.next();

                    if(alunos.contains(aluno)){ //Se o array contém o aluno escaneado...
                        System.out.println("Aluno encontrado!");
                    }
                    else{
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 4:
                    if(alunos.isEmpty()){
                        System.out.println("Nenhum aluno cadastrado.");
                        break;
                    }

                    System.out.print("Digite o nome do aluno que quer remover: ");
                    aluno = scanner.next();

                    if(alunos.contains(aluno)){
                        alunos.remove(aluno);
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }

                default: System.out.print("Opcao invalida!");
            }
        }
        scanner.close();
    }
}

//Crie um programa em Java que simule um sistema simples de cadastro de alunos utilizando ArrayList.
// O programa deverá apresentar um menu interativo com as seguintes opções:
//Adicionar aluno
//Listar alunos cadastrados
//Buscar aluno pelo nome
//Remover aluno
//Sair do programa