class Professor extends Funcionario {

    private String titulo;

    public Professor(String nome, String fone, String cpf,
                     int codigo, String funcao, String titulo) {

        super (nome, fone, cpf, codigo, funcao);

        this.titulo = titulo;
    }

    public void ensina() {
        System.out.println(nome + " está ensinando.");
    }
}