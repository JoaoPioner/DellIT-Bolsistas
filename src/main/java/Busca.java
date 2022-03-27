/* @Author: Joao Vitor de Almeida Prado Pioner*/
import java.util.*;

public class Busca {
    public Busca(){}
    //[Consultar média anual] Pega todos os bolsistas do ano inputado e imprime a media dos seus valores da bolsa
    public void buscaMediaValoresAno(List<Aluno> bolsistas, int ano) {
        ArrayList<Aluno> alunosAno = new ArrayList<>(); // guarda todos os alunos que entraram no mesmo ano
        for (Aluno a:
             bolsistas) {// para cada aluno em bolsistas se o ano que eles entraram eh o mesmo que o inputado no console, adiciona ele na lista
            if(a.getAno() == ano) {
                alunosAno.add(a);
            }
        }
        double valorTotal = 0;
        for (Aluno aluno : alunosAno) { // pega o valor de todo mundo dentro da lista e acumula o valor de suas bolsas
            valorTotal += aluno.getValor();
        }
        double res = valorTotal/alunosAno.size(); // total/numero de bolsistas
        System.out.println("Media de valores do ano " + ano + ": R$" + res);
    }
    //[Consultar bolsa zero/Ano] Imprime aquele que tem a flag BolsistaZero true, e que tenha sido no mesmo ano q o ano inputado
    public void buscaBolsistaZero(List<Aluno> bolsistas ,int ano) {
        for (Aluno a:
             bolsistas) {// procura pelo bolsista zero no ano inputado
            if (a.isBolsistaZero() && a.getAno() == ano) { // dentro da classo aluno tem um boolean que inicialmente eh false ateh descobrir que ele eh o primeiro do ano dentro da funcao load da classe sistema
                System.out.println( "\n____________" +
                                    "\nAluno: " + a.getNome() +
                                    "\nCPF: "+ a.getCpf() +
                                    "\nEntidade de Ensino: " + a.getEntidade() +
                                    "\nValor: " + a.getValor() +
                                    "\n____________");
                break;
            }
        }
    }
    //[Codificar nomes] Imprime os dados do bolsista com o seu nome encriptado
    public void buscaBolsista(List<Aluno> bolsistas, String nome) {
        Codificador coder = new Codificador();
        for (Aluno a:
             bolsistas) {// procura todos os bolsistas que tem o nome inserido no console
            if (a.getNome().contains(nome)) {// ao achar imprime os dados dele com o nome codificado
                String nomeCodificado = coder.coder(a.getNome());
                System.out.println( "____________" +
                                    "\nAluno: " + nomeCodificado +
                                    "\nAno: "+ a.getAno() +
                                    "\nEntidade de Ensino: " + a.getEntidade() +
                                    "\nValor: " + a.getValor() +
                                    "____________");
            } // DETALHE: Caso esse bolsista esteja no mesmo .csv em outros anos, ele aparecera repetido. Exemplo: alexandre ribeiro neto, aparecera 3 vezes, cada um com o ano respectivo quando ele entro no sistema
        }
    }
    //[Ranking valores de bolsa] Ordena os bolsistas pelo valor de suas bolsas e imprime os 3 mais caros e os 3 mais baratos
    public void buscaRank (List<Aluno> bolsista) {
        ArrayList<Aluno> bolsistasOrdenados = new ArrayList<>(bolsista);
        bolsistasOrdenados.sort(Comparator.naturalOrder());// ordena de maneira crescente os bolsistas pelos valores da bolsa de cada bolsista
        // para ordenar foi necessario implementar as funcoes do comparable na classe Aluno
        System.out.println( "3 Bolsas mais caras: " +
                            "\n1: " + bolsistasOrdenados.get(bolsistasOrdenados.size()-1) +
                            "\n2: " + bolsistasOrdenados.get(bolsistasOrdenados.size()-2) +
                            "\n3: " + bolsistasOrdenados.get(bolsistasOrdenados.size()-3) +
                            "\n3 bolsas mais baratas: " +
                            "\n1: " + bolsistasOrdenados.get(0) +
                            "\n2: " + bolsistasOrdenados.get(1) +
                            "\n3: " + bolsistasOrdenados.get(2));
    }

}
