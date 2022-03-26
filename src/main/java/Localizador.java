import java.util.ArrayList;
import java.util.List;

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
                System.out.println( "____________" +
                                    "\nAluno: " + a.getNome() +
                                    "\nCPF: "+ a.getCpf() +
                                    "\nEntidade de Ensino: " + a.getentidade() +
                                    "\nValor: " + a.getValor() +
                                    "____________");
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

}
