/* @Author: Joao Vitor de Almeida Prado Pioner*/
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class TestesBusca {
    @Test
    void testeBuscaRank() {
       Busca buscador = new Busca();
        ArrayList<Aluno> bolsistas = new ArrayList<>();
        bolsistas.add(new Aluno("JOAO V", "000001", "PUC", 1, 2000, "DED", "POA", "SGB", "TUTOR", "R$", 100));
        bolsistas.add(new Aluno("JOAO P", "000011", "PUX", 1, 2000, "DED", "CXS", "SGB", "TUTOR", "R$", 50));
        bolsistas.add(new Aluno("JOAO A", "000111", "PUQ", 1, 2000, "DED", "SPO", "SGB", "TUTOR", "R$", 200));
        buscador.buscaRank(bolsistas);
    }

    @Test
    void testeBuscaBolsista() {
        Busca buscador = new Busca();
        ArrayList<Aluno> bolsistas = new ArrayList<>();
        bolsistas.add(new Aluno("JOAO V", "000001", "PUC", 1, 2000, "DED", "POA", "SGB", "TUTOR", "R$", 100));
        bolsistas.add(new Aluno("JOAO P", "000011", "PUX", 1, 2000, "DED", "CXS", "SGB", "TUTOR", "R$", 50));
        bolsistas.add(new Aluno("JOAO A", "000111", "PUQ", 1, 2000, "DED", "SPO", "SGB", "TUTOR", "R$", 200));
        buscador.buscaBolsista(bolsistas, "JOAO V");
    }

    @Test
    void testeBuscaBolsistaZero() {
        Busca buscador = new Busca();
        ArrayList<Aluno> bolsistas = new ArrayList<>();
        bolsistas.add(new Aluno("JOAO V", "000001", "PUC", 1, 2000, "DED", "POA", "SGB", "TUTOR", "R$", 100));
        bolsistas.add(new Aluno("JOAO P", "000011", "PUX", 1, 2000, "DED", "CXS", "SGB", "TUTOR", "R$", 50));
        bolsistas.add(new Aluno("JOAO A", "000111", "PUQ", 1, 2000, "DED", "SPO", "SGB", "TUTOR", "R$", 200));
        buscador.buscaBolsistaZero(bolsistas, 2000);
    }

    @Test
    void testeMediaValores() {
        Busca buscador = new Busca();
        ArrayList<Aluno> bolsistas = new ArrayList<>();
        bolsistas.add(new Aluno("JOAO V", "000001", "PUC", 1, 2000, "DED", "POA", "SGB", "TUTOR", "R$", 100));
        bolsistas.add(new Aluno("JOAO P", "000011", "PUX", 1, 2000, "DED", "CXS", "SGB", "TUTOR", "R$", 50));
        bolsistas.add(new Aluno("JOAO A", "000111", "PUQ", 1, 2000, "DED", "SPO", "SGB", "TUTOR", "R$", 200));
        buscador.buscaMediaValoresAno(bolsistas, 2000);
    }

}
