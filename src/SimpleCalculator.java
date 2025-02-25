import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validOutput = false;
        int calculatorOperator = 0;
        int firstNumber = 0;
        int secondNumber = 0;

        while (!validOutput) {
            System.out.println("Que operação deseja realizar?");

            if (scanner.hasNextInt()) {
                calculatorOperator = scanner.nextInt();
                if (calculatorOperator >= 1 && calculatorOperator <= 4) {
                    validOutput = true;
                } else {
                    System.out.println("Digita um número de 1 a 4");
                }
            } else {
                System.out.println("Insira um número inteiro");
                scanner.next();
            }

        }
        switch (calculatorOperator) {
            case 1:
                System.out.println("Escolheu Soma");
                break;
            case 2:
                System.out.println("Escolheu Subtração");
                break;
            case 3:
                System.out.println("Escolheu Multiplicação");
                break;
            case 4:
                System.out.println("Escolheu Divisão");
                break;
            default:
                System.out.println("Escolha Inválida");
        }

        validOutput = false;

        while (!validOutput) {

            System.out.println("Insira o primeiro valor:");
            if (scanner.hasNextInt()) {
                firstNumber = scanner.nextInt();
                System.out.println("Primeiro valor válido e inserido");
            } else {
                System.out.println("Erro: Insira um valor inteiro");
                scanner.next();
            }
            System.out.println("Insira o segundo valor:");
            if (scanner.hasNextInt()) {
                secondNumber = scanner.nextInt();
                validOutput = true;
            } else {
                System.out.println("Erro: Insira um valor inteiro");
                scanner.next();
            }

            System.out.println("Fim do programa");
            firstNumber = scanner.nextInt();
        }
    }
}
