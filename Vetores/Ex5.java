import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] soma = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("V1: ");
            v1[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("V2: ");
            v2[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            soma[i] = v1[i] + v2[i];
        }

        Arrays.sort(soma);

        System.out.println("Vetor soma ordenado:");
        for (int i = 0; i < 5; i++) {
            System.out.println(soma[i]);
        }
    }
}
