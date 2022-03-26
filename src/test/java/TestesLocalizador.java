import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestesLocalizador {
    @Test
    void testeBuscaRank() {
       Localizador buscador = new Localizador();
        ArrayList<Aluno> bolsistas = new ArrayList<>();
        bolsistas.add(new Aluno("Joao V", "000000", "PUC", 100, 2000, true));
        bolsistas.add(new Aluno("Joao P", "000010", "PUX", 50, 2000, false));
        bolsistas.add(new Aluno("Joao A", "000110", "PUQ", 200, 2000, false));
        buscador.buscaRank(bolsistas);
    }

    @Test
    void testeBuscaBolsista() {
        Localizador buscador = new Localizador();
        ArrayList<Aluno> bolsistas = new ArrayList<>();
        bolsistas.add(new Aluno("JOAO V", "000000", "PUC", 100, 2000, true));
        bolsistas.add(new Aluno("JOAO P", "000010", "PUX", 50, 2000, false));
        bolsistas.add(new Aluno("JOAO A", "000110", "PUQ", 200, 2000, false));
        buscador.buscaBolsista(bolsistas, "JOAO V");
    }

}
