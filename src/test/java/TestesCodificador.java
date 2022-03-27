/* @Author: Joao Vitor de Almeida Prado Pioner*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestesCodificador {
    @Test
    void testeCodificacao() {
        Codificador coder = new Codificador();
        assertEquals("QHJSFP", coder.coder("PERIGO"));
        assertEquals("DDOJP", coder.coder("CINCO"));
        assertEquals("GHVB", coder.coder("FUGA"));
        assertEquals("K PBPW", coder.coder("JOAO V"));
        assertEquals("ABQ", coder.coder("PAZ"));
        assertEquals("QBQ ABA", coder.coder("PAZ PAZ"));
        assertEquals("QBQ ABQ ABA", coder.coder("PAZ PAZ PAZ"));
    }

}
