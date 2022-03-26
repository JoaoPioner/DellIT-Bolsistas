public class Aluno implements Comparable<Aluno>{
    private String nome;
    private String cpf;
    private String entidade;
    private int mes;
    private int ano;
    private String diretoria;
    private String origem;
    private String modalidadeSGB;
    private String modalidadePG;
    private String moeda;
    private double valor;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEntidade() {
        return entidade;
    }

    public void setEntidade(String entidade) {
        this.entidade = entidade;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretoria() {
        return diretoria;
    }

    public void setDiretoria(String diretoria) {
        this.diretoria = diretoria;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getModalidadeSGB() {
        return modalidadeSGB;
    }

    public void setModalidadeSGB(String modalidadeSGB) {
        this.modalidadeSGB = modalidadeSGB;
    }

    public String getModalidadePG() {
        return modalidadePG;
    }

    public void setModalidadePG(String modalidadePG) {
        this.modalidadePG = modalidadePG;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
