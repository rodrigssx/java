class Funcionario extends Pessoa {

    protected int codigo;
    protected String funcao;

    public Funcionario(String nome, String fone, String cpf,
                       int codigo, String funcao) {

        super(nome, fone, cpf);

        this.codigo = codigo;
        this.funcao = funcao;
    }

    public void desempenhaFuncao() {
        System.out.println(nome + " trabalha como " + funcao);
    }
}