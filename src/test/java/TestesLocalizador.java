import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class TestesLocalizador {
    @Test
    void testeBuscaRank() {
       Localizador buscador = new Localizador();
        ArrayList<Aluno> bolsistas = new ArrayList<>();
        bolsistas.add(new Aluno("JOAO V", "000001", "PUC", 1, 2000, "DED", "POA", "SGB", "TUTOR", "R$", 100));
        bolsistas.add(new Aluno("JOAO P", "000011", "PUC", 1, 2000, "DED", "CXS", "SGB", "TUTOR", "R$", 50));
        bolsistas.add(new Aluno("JOAO A", "000111", "PUC", 1, 2000, "DED", "SPO", "SGB", "TUTOR", "R$", 200));
        buscador.buscaRank(bolsistas);
    }

    @Test
    void testeBuscaBolsista() {
        Localizador buscador = new Localizador();
        ArrayList<Aluno> bolsistas = new ArrayList<>();
        bolsistas.add(new Aluno("JOAO V", "000001", "PUC", 1, 2000, "DED", "POA", "SGB", "TUTOR", "R$", 100));
        bolsistas.add(new Aluno("JOAO P", "000011", "PUC", 1, 2000, "DED", "CXS", "SGB", "TUTOR", "R$", 50));
        bolsistas.add(new Aluno("JOAO A", "000111", "PUC", 1, 2000, "DED", "SPO", "SGB", "TUTOR", "R$", 200));
        buscador.buscaBolsista(bolsistas, "JOAO V");
    }

    @Test
    void testeBuscaBolsistaZero() {
        Localizador buscador = new Localizador();
        ArrayList<Aluno> bolsistas = new ArrayList<>();
        bolsistas.add(new Aluno("JOAO V", "000001", "PUC", 1, 2000, "DED", "POA", "SGB", "TUTOR", "R$", 100));
        bolsistas.add(new Aluno("JOAO P", "000011", "PUC", 1, 2000, "DED", "CXS", "SGB", "TUTOR", "R$", 50));
        bolsistas.add(new Aluno("JOAO A", "000111", "PUC", 1, 2000, "DED", "SPO", "SGB", "TUTOR", "R$", 200));
        buscador.buscaBolsistaZero(bolsistas, 2000);
    }

    @Test
    void testeMediaValores() {
        Localizador buscador = new Localizador();
        ArrayList<Aluno> bolsistas = new ArrayList<>();
        bolsistas.add(new Aluno("JOAO V", "000001", "PUC", 1, 2000, "DED", "POA", "SGB", "TUTOR", "R$", 100));
        bolsistas.add(new Aluno("JOAO P", "000011", "PUC", 1, 2000, "DED", "CXS", "SGB", "TUTOR", "R$", 50));
        bolsistas.add(new Aluno("JOAO A", "000111", "PUC", 1, 2000, "DED", "SPO", "SGB", "TUTOR", "R$", 200));
        double valorEsperado = 116.66666666666666666666666666667;
        assertEquals(valorEsperado,buscador.buscaMediaValoresAno(bolsistas, 2000));
    }

}
