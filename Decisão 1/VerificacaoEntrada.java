import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VerificacaoEntrada {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
            String dataTexto = scanner.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataNascimento = LocalDate.parse(dataTexto, formatter);

            LocalDate hoje = LocalDate.now();
            int idade = Period.between(dataNascimento, hoje).getYears();

            LocalTime agora = LocalTime.now();
            int hora = agora.getHour();

            String saudacao;

            if (hora >= 6 && hora < 12) {
                saudacao = "Bom dia";
            } else if (hora >= 12 && hora < 18) {
                saudacao = "Boa tarde";
            } else {
                saudacao = "Boa noite";
            }

            System.out.println("\n" + saudacao + ", " + nome + "!");
            System.out.println("Você tem " + idade + " anos.");

            if (idade >= 18) {
                System.out.println("Entrada liberada.");
            } else {
                System.out.println("Entrada não liberada.");
            }
        }
    }
}