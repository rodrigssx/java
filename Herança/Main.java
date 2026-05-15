public class Main {

    public static void main(String[] args) {

        Aluno a1 = new Aluno(
                "Carlos",
                "9999-9999",
                "111.111.111-11",
                "2025001"
        );

        Professor p1 = new Professor(
                "Maria",
                "8888-8888",
                "222.222.222-22",
                10,
                "Professor",
                "Mestre"
        );

        Responsavel r1 = new Responsavel(
                "João",
                "7777-7777",
                "333.333.333-33",
                a1
        );

        a1.saudacao();
        a1.aprende();

        p1.saudacao();
        p1.desempenhaFuncao();
        p1.ensina();

        r1.mostrarAluno();
    }
}