import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine().toLowerCase();

        int vogais = 0, consoantes = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
    }
}
