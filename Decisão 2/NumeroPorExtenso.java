import java.util.Scanner;

public class NumeroPorExtenso {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número entre 1 e 1000: ");
            int num = sc.nextInt();

            System.out.println(numeroExtenso(num));
        }
    }

    static String numeroExtenso(int num) {
        String[] unidades = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] dezenas = {"", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        String[] especiais = {"dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] centenas = {"", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};

        if (num == 1000) return "mil";
        if (num == 100) return "cem";

        StringBuilder resultado = new StringBuilder();

        int c = num / 100;
        int d = (num % 100) / 10;
        int u = num % 10;

        if (c > 0) {
            resultado.append(centenas[c]);
            if (d > 0 || u > 0) resultado.append(" e ");
        }

        if (d == 1) {
            resultado.append(especiais[u]);
        } else {
            if (d > 0) {
                resultado.append(dezenas[d]);
                if (u > 0) resultado.append(" e ");
            }
            if (u > 0) resultado.append(unidades[u]);
        }

        return resultado.toString();
    }
}
