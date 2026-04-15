import java.time.LocalTime;

public class Saudacao {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        int hora = agora.getHour();

        if (hora >= 6 && hora < 12) {
            System.out.println("Bom dia");
        } else if (hora >= 18 && hora < 22) {
            System.out.println("Boa noite");
        } else if (hora >= 22 || hora < 6) {
            System.out.println("Vai dormir");
        } else {
            System.out.println("Boa tarde");
        }
    }
}