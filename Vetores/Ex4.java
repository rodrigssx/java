import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota, soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Nota do aluno " + (i+1) + ": ");
            nota = sc.nextDouble();

            soma += nota;

            if (nota > maior) maior = nota;
            if (nota < menor) menor = nota;
        }

        System.out.println("Média da turma: " + (soma / 10));
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
    }
}
