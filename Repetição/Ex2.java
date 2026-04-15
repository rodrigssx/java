import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Digite dois números: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = a; i >= b; i--) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
