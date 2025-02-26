import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLearning {
    public static void main(String[] args) {

        boolean programActive = true;
        int option = 0;
        Scanner scanner = new Scanner(System.in);

        List<String> cores = new ArrayList<String>();


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
                    for (String cor : cores) {
                        System.out.println(cor);
                    }
                    break;
                case 2:
                    System.out.println("Que filme deseja adicionar?");
                    String filme = scanner.nextLine();
                    cores.add(filme);
                    break;
                case 3:
                    System.out.println("Escolheu remover filme");
                    break;
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
