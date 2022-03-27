/* @Author: Joao Vitor de Almeida Prado Pioner*/
public class Aluno implements Comparable<Aluno>{
    /* Tudo que nao pode ser modificado se tornou final*/
    private final String nome;
    private final String cpf;
    private final String entidade;
    private final int mes;
    private final int ano;
    private final String diretoria;
    private final String origem;
    private final String modalidadeSGB;
    private final String modalidadePG;
    private final String moeda;
    private final double valor;
    private boolean bolsistaZero;

    public Aluno(String nome, String cpf, String entidade, int mes, int ano, String diretoria, String origem, String modalidadeSGB, String modalidadePG, String moeda, double valor) {
        this.nome = nome;
        this.cpf = cpf;
        this.entidade = entidade;
        this.mes = mes;
        this.ano = ano;
        this.diretoria = diretoria;
        this.origem = origem;
        this.modalidadeSGB = modalidadeSGB;
        this.modalidadePG = modalidadePG;
        this.moeda = moeda;
        this.valor = valor;
        bolsistaZero = false;
    }
    /*Todos os getter e setters que foram usados*/
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEntidade() {
        return entidade;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public boolean isBolsistaZero() {
        return bolsistaZero;
    }

    public void setBolsistaZero(boolean bolsistaZero) {
        this.bolsistaZero = bolsistaZero;
    }

    @Override
    public String toString() {
        return  "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nENTIDADE: " + entidade +
                "\nMES: " + mes +
                "\nANO: " + ano +
                "\nDIRETORIA: " + diretoria +
                "\nORIGEM: " + origem +
                "\nMODALIDADE SGB: " + modalidadeSGB +
                "\nMODALIDADE PG: " + modalidadePG +
                "\nMOEDA: " + moeda +
                "\nVALOR: " + valor +
                "\n____________";
    }

    //Usado para ordenar os bolsistas pelo valor das suas bolsas
    @Override
    public int compareTo(Aluno aluno) {
        return Double.compare(this.valor, aluno.getValor());
    }
}
