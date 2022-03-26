import java.util.*;

public class Localizador {
    public Localizador(){}

    public double buscaMediaValoresAno(List<Aluno> bolsistas, int ano) {
        ArrayList<Aluno> alunosAno = new ArrayList<>();
        for (Aluno a:
             bolsistas) {
            if(a.getAno() == ano) {
                alunosAno.add(a);
            }
        }
        double valorTotal = 0;
        for (int i = 0; i < alunosAno.size(); i++) {
            valorTotal += alunosAno.get(i).getValor();
        }
        return valorTotal/alunosAno.size();
    }

    public void buscaBolsistaZero(List<Aluno> bolsistas ,int ano) {
        for (Aluno a:
             bolsistas) {
            if (a.isBolsistaZero() && a.getAno() == ano) {
                System.out.println( "\n____________" +
                                    "\nAluno: " + a.getNome() +
                                    "\nCPF: "+ a.getCpf() +
                                    "\nEntidade de Ensino: " + a.getentidade() +
                                    "\nValor: " + a.getValor() +
                                    "\n____________");
            }
        }
    }

    public void buscaBolsista(List<Aluno> bolsistas, String nome) {
        Codificador coder = new Codificador();
        for (Aluno a:
             bolsistas) {
            if (a.getNome().contains(nome)) {
                String nomeCodificado = coder.coder(a.getNome());
                System.out.println( "____________" +
                                    "\nAluno: " + nomeCodificado +
                                    "\nAno: "+ a.getAno() +
                                    "\nEntidade de Ensino: " + a.getentidade() +
                                    "\nValor: " + a.getValor() +
                                    "____________");
            }
        }
    }

    public void buscaRank (List<Aluno> bolsista) {
        ArrayList<Aluno> bolsistasOrdenados = new ArrayList<>(bolsista);
        Collections.sort(bolsistasOrdenados, Comparator.naturalOrder());
        System.out.println( "3 Bolsas mais caras: " +
                            "\n1: " + bolsistasOrdenados.get(bolsistasOrdenados.size()-1) +
                            "\n2: " + bolsistasOrdenados.get(bolsistasOrdenados.size()-2) +
                            "\n3: " + bolsistasOrdenados.get(bolsistasOrdenados.size()-3) +
                            "\n3 bolsas mais baratas: " +
                            "\n 1: " + bolsistasOrdenados.get(0) +
                            "\n 2: " + bolsistasOrdenados.get(1) +
                            "\n 3: " + bolsistasOrdenados.get(2));
    }

}
