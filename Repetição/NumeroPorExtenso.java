import java.util.Scanner;

public class NumeroPorExtenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            System.out.println(n + i);
        }
    }
}
