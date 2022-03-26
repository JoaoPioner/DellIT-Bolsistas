public class Aluno implements Comparable<Aluno>{
    private String nome;
    private String cpf;
    private String entidade;
    private double valor;
    private int ano;
    private boolean bolsistaZero;

    public Aluno(String nome, String cpf, String entidade, double valor, int ano, boolean bolsistaZero) {
        this.nome = nome;
        this.cpf = cpf;
        this.entidade = entidade;
        this.valor = valor;
        this.ano = ano;
        this.bolsistaZero = bolsistaZero;
    }

    public boolean isBolsistaZero() {
        return bolsistaZero;
    }

    public void setBolsistaZero(boolean bolsistaZero) {
        this.bolsistaZero = bolsistaZero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getentidade() {
        return entidade;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setentidade(String entidade) {
        this.entidade = entidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  "\n____________" +
                "\nAluno: " + nome +
                "\nCPF: "+ cpf +
                "\nEntidade de Ensino: " + entidade +
                "\nValor: " + valor +
                "\n____________" ;
    }

    @Override
    public int compareTo(Aluno aluno) {
        if (this.valor < aluno.getValor()) {
            return -1;
        }
        if (this.valor > aluno.getValor()) {
            return 1;
        }
        return 0;
    }
}
