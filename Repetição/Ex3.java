import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 1234;
        int tentativa;

        do {
            System.out.print("Digite a senha: ");
            tentativa = sc.nextInt();
        } while (tentativa != senha);

        System.out.println("Acesso liberado!");
    }
}