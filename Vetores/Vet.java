import java.util.Scanner;

public class Vet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Valores digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vet[i]);
        }
    }
}
