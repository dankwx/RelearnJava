import java.util.Scanner;

public class NameInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");

        String userName = scanner.nextLine();

        System.out.println("Seu nome é: " + userName);
    }
}
