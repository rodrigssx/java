import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " + " + i + " = " + (n + i));
            System.out.println(n + " - " + i + " = " + (n - i));
            System.out.println(n + " * " + i + " = " + (n * i));
            System.out.println(n + " / " + i + " = " + (n / i));
            System.out.println("--------");
        }
    }
}