import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num, soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextDouble();

            soma += num;

            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }

        System.out.println("Média: " + (soma / 5));
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}