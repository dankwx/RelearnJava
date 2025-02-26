import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLearning {
    public static void main(String[] args) {

        boolean programActive = true;
        int option = 0;
        Scanner scanner = new Scanner(System.in);

        List<String> filmes = new ArrayList<>();


        while (programActive) {

            System.out.println("O que deseja fazer?");
            System.out.println("1. Listar filmes.");
            System.out.println("2. Adicionar filme.");
            System.out.println("3. Remover filme.");
            System.out.println("4. Sair.");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine();

                if (option >= 1 && option <= 4) {
                    System.out.println("Escolha aceita");
                } else {
                    System.out.println("Insira um número de 1 a 4");
                }
            } else {
                System.out.println("Insira um número inteiro");
                scanner.next();
            }
            switch (option) {
                case 1:
                    for (String cor : filmes) {
                        System.out.println(cor);
                    }
                    break;
                case 2:
                    System.out.println("Que filme deseja adicionar?");
                    String filme = scanner.nextLine();
                    filmes.add(filme);
                    break;
                case 3:
                    if (!filmes.isEmpty()) {
                        System.out.println("Que filme deseja remover?");
                        for (int i = 0; i < filmes.size(); i++) {
                            System.out.println(i + ". " + filmes.get(i));
                        }
                        if (scanner.hasNextInt()) {
                            int escolha = scanner.nextInt();
                            scanner.nextLine();
                            if (escolha <= filmes.size()) {
                                filmes.remove(escolha);
                            } else {
                                System.out.println("Escolha um número de 0 a " + filmes.size());
                                scanner.next();
                            }
                        } else {
                            System.out.println("Insira um número.");
                            scanner.next();
                        }
                        break;
                    } else {
                        System.out.println("Ainda não há filmes na lista.");
                    }
                case 4:
                    System.out.println("Até mais!");
                    programActive = false;
                    break;
                default:
                    System.out.println("Escolha inválida");

            }

        }

    }
}
