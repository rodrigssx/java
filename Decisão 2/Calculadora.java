import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double num1, num2;
            int op;

            System.out.print("Digite o primeiro número: ");
            num1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            num2 = sc.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            op = sc.nextInt();

            switch (op) {
                case 1 -> System.out.println("Resultado: " + (num1 + num2));
                case 2 -> System.out.println("Resultado: " + (num1 - num2));
                case 3 -> System.out.println("Resultado: " + (num1 * num2));
                case 4 -> {
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Não é possível dividir por zero");
                    }
                }
                default -> System.out.println("Operação inválida");
            }
        }
    }
}
