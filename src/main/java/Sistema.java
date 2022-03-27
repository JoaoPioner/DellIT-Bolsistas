/* @Author: Joao Vitor de Almeida Prado Pioner*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private static final String fonte = "src/main/resources/br-capes-bolsistas-uab.csv";
    private static final Scanner teclado = new Scanner(System.in);
    private static final ArrayList<Aluno> bolsistas = new ArrayList<>();
    private static ArrayList<Integer> anos = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {// INICIO DO PROGRAMA
        load(fonte);
        interfaceSistema();
    }

    public static void load(String fonte)throws FileNotFoundException  { // carrega o arquivo .csv
        BufferedReader br = new BufferedReader(new FileReader(fonte));
        String linha;
        String[] linhaLst;

        Aluno a;

        try {
            br.readLine();
            while ((linha = br.readLine()) != null) {
                    linhaLst = linha.split(";");
                    a = new Aluno(  linhaLst[0],
                            linhaLst[1],
                            linhaLst[2],
                            Integer.parseInt(linhaLst[3]),
                            Integer.parseInt(linhaLst[4]),
                            linhaLst[5],
                            linhaLst[6],
                            linhaLst[7],
                            linhaLst[8],
                            linhaLst[9],
                            Double.parseDouble(linhaLst[10]));
                    if(!anos.contains(a.getAno())) {
                        a.setBolsistaZero(true);
                        anos.add(a.getAno());
                    }
                    bolsistas.add(a);
            }
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
        System.out.println(bolsistas.size() + " carregados...");// uma resposta visual para o usuario, para dizer que o load funcionou
    }

    private static void interfaceSistema() {// onde o usuario interage com o sistema
        int escolha;
        System.out.println("Seja bem-vindo ao sistema de bolsistas de Porto Alegre");
        boolean loop = true;
        Busca local = new Busca();
        while(loop) {// um loop infinito (inicialmente) que recebe o input do usuario
            System.out.println("Por favor selecione um servico: \n");
            System.out.println("1- Consultar bolsa zero/Ano");
            System.out.println("2- Conferir dados de bolsista");
            System.out.println("3- Consultar média anual");
            System.out.println("4- Ranking valores de bolsa");
            System.out.println("0- Terminar o programa\n");
            escolha = teclado.nextInt();
            switch (escolha) {
                case 1: {//[Consultar bolsa zero/Ano]
                    System.out.println("Por favor, Insira um ano:");
                    int ano =  teclado.nextInt();
                    if(!anos.contains(ano)) {
                        System.out.println("Ano inserido nao existente no arquivo, tente inserir outro ano");
                    }
                    local.buscaBolsistaZero(bolsistas,ano);
                }break;
                case 2: {//[Codificar nomes]
                    teclado.nextLine();
                    String nome;
                    System.out.println("Por favor, insira um nome: ");
                    nome = teclado.nextLine().toUpperCase();
                    local.buscaBolsista(bolsistas,nome);
                }break;
                case 3: {//[Consultar média anual]
                    System.out.println("Por favor, Insira um ano:");
                    int ano = teclado.nextInt();
                    if(!anos.contains(ano)) {
                        System.out.println("Ano inserido nao existente no arquivo, tente inserir outro ano");
                    }
                    local.buscaMediaValoresAno(bolsistas,ano);
                }break;
                case 4: {//[Ranking valores de bolsa]
                    local.buscaRank(bolsistas);
                }break;
                case 0: {//[Terminar o programa]
                    System.out.println("Obrigado");
                    loop = false;
                }break;
                default: {
                    System.out.println("Input invalido, tente novamente");
                }
            }
        }
        teclado.close();
    }


}
