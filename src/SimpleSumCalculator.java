import java.util.Scanner;

public class SimpleSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o primeiro número da soma?");
        int FirstNumber = scanner.nextInt();

        System.out.println("Qual o segundo número da soma?");
        int SecondNumber = scanner.nextInt();

        System.out.println("A soma dos dois números informados é: " +
                (FirstNumber + SecondNumber));
    }
}
