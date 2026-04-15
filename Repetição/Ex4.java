public class Ex4 {
    public static void main(String[] args) {

        int soma = 0;

        for (int i = 2; i <= 50; i++) {
            int cont = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }

            if (cont == 2) {
                System.out.println(i);
                soma += i;
            }
        }

        System.out.println("Soma: " + soma);
    }
}
