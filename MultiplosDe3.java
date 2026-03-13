import java.util.Scanner;

public class MultiplosDe3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1, n2;

            System.out.print("Digite o primeiro número: ");
            n1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            n2 = sc.nextInt();

            if (n1 < n2) {
                for (int i = n1; i <= n2; i++) {
                    if (i % 3 == 0) {
                        System.out.println(i);
                    }
                }
            } else {
                for (int i = n1; i >= n2; i--) {
                    if (i % 3 == 0) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}