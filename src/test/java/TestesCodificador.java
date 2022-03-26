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

    @Test
    void testeDecodificacao() {
        Codificador coder = new Codificador();
        assertEquals("PERIGO", coder.decoder("QHJSFP"));
        assertEquals("CINCO", coder.decoder("DDOJP"));
        assertEquals("FUGA", coder.decoder("GHVB"));
        assertEquals("PAZ", coder.decoder("ABQ"));
        assertEquals("PAZ PAZ", coder.decoder("QBQ ABA"));
        assertEquals("PAZ PAZ PAZ", coder.decoder("QBQ ABQ ABA"));
    }

}
