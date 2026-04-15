import java.util.Scanner;

public class Saudação {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Bem-vindo, " + nome + "!");
    }
}