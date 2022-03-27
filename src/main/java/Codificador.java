/* @Author: Joao Vitor de Almeida Prado Pioner*/
public class Codificador {

    private final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Codificador() {
    }
    //Funcao responsavel a comecar o processo de encriptar o nome e pegar cada letra da palavra invertida e trocar com a proxima letra no alfabeto
    public String coder(String nome) {
        String codificado = coding(nome);//guarda a palavra invertida
        StringBuilder codificadoSB = new StringBuilder(codificado);
        char r;
        for (int i = 0; i<codificado.length(); i++) {//atravessa o nome para trocar as letra .
            char c = codificado.charAt(i);
            if(c == 'Z') {// se o char for z ele volta para o inicio do alfabeto
                r = ALFABETO.charAt(0);
            } else if(c == ' ') {// se for um espaco ele simplismente pula
                continue;
            } else {
                r = ALFABETO.charAt(ALFABETO.indexOf(c)+1);//guarda a proxima letra do alfabeto
            }
            codificadoSB.setCharAt(i, r);//a troca acontece
        }
        return codificadoSB.toString();
    }
    //Funcao que primeiro, troca as duas letras das pontas e depois vira tudo
    private String coding(String nome) {
        String nomeCodificado = nome.charAt(nome.length()-1) + nome.substring(1,nome.length()-1) + nome.charAt(0);// inverte as letras das pontas
        if (nomeCodificado.length()>3) {// se o nome for maior q 3 letras ele chama uma funca que inverte a palavra
            return flip(nomeCodificado);
        }
        return nomeCodificado;// caso contrario ele soh retorna a palavra
    }
    // Funcao recursiva que inverte a palavra
    private String flip(String nome) {
        if (nome.length()<=1) {// CASO DE PARADA: se o nome for menor ou igual a 1
            return nome;
        }
        char first = nome.charAt(0);
        char last = nome.charAt(nome.length()-1);
        return last + flip(nome.substring(1,nome.length()-1)) + first;// pegas as pontas invertem eles de lugar e chama recursivamente a mesma funcao para ir trocando as letras em ponta a ponta
    }
}
