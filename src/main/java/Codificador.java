public class Codificador {

    private final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Codificador() {
    }

    public String coder(String nome) {
        String codificado = coding(nome);
        StringBuilder codificadoSB = new StringBuilder(codificado);
        char r = ' ';
        for (int i = 0; i<codificado.length(); i++) {
            char c = codificado.charAt(i);
            if(c == 'Z') {
                r = ALFABETO.charAt(0);
            } else if(c == ' ') {
                continue;
            } else {
                r = ALFABETO.charAt(ALFABETO.indexOf(c)+1);
            }
            codificadoSB.setCharAt(i, r);
        }
        return codificadoSB.toString();
    }

    private String coding(String nome) {
        String nomeCodificado = nome.charAt(nome.length()-1) + nome.substring(1,nome.length()-1) + nome.charAt(0);
        if (nomeCodificado.length()>3) {
            return flip(nomeCodificado);
        }
        return nomeCodificado;
    }

    private String flip(String nome) {
        if (nome.length()<=1) {
            return nome;
        }
        char first = nome.charAt(0);
        char last = nome.charAt(nome.length()-1);
        return last + flip(nome.substring(1,nome.length()-1)) + first;
    }

    public String decoder(String nome) {
        StringBuilder decodificadoSB = new StringBuilder(nome);
        char r = ' ';
        for (int i = 0; i<nome.length(); i++) {
            char c = nome.charAt(i);
            if(c == 'A') {
                r = ALFABETO.charAt(ALFABETO.length()-1);
            } else if(c == ' ') {
                continue;
            } else {
                r = ALFABETO.charAt(ALFABETO.indexOf(c)-1);
            }
            decodificadoSB.setCharAt(i, r);
        }
        if (decodificadoSB.toString().length()>3) {
            return decoding(decodificadoSB.toString());
        }
        return flip(decodificadoSB.toString());
    }

    private String decoding(String nome) {
        String nomeDecodificado = flip(nome);
        nomeDecodificado = nomeDecodificado.charAt(nome.length()-1) + nomeDecodificado.substring(1,nome.length()-1) + nomeDecodificado.charAt(0);
        return nomeDecodificado;
    }

}
