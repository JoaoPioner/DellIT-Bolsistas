import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private static String fonte = "src/main/resources/br-capes-bolsistas-uab.csv";
    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<Aluno> bolsistas = new ArrayList<>();
    public static void load(String fonte)throws FileNotFoundException  {
        BufferedReader br = new BufferedReader(new FileReader(fonte));
        String linha = "";
        String[] linhaLst;

        Aluno a;

        ArrayList<Integer> anos = new ArrayList<>();

        try {
            br.readLine();
            while ((linha = br.readLine()) != null) {
                try {
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
                }catch (NumberFormatException e) {
                    continue;
                }
            }
            br.close();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(bolsistas.size() + " carregados...");
    }
    public static void main(String[] args) throws FileNotFoundException {
        load(fonte);
        interfaceSistema();
    }

    private static void interfaceSistema() {
        int escolha = 0;
        System.out.println("Seja bem-vindo ao sistema de internacoes de Porto Alegre");
        boolean loop = true;
        Localizador local = new Localizador();
        while(loop) {
            System.out.println("Por favor selecione um servico: \n");
            System.out.println("1- Consultar bolsa zero/Ano");
            System.out.println("2- Codificar nomes");
            System.out.println("3- Consultar média anual");
            System.out.println("4- Ranking valores de bolsa");
            System.out.println("0- Terminar o programa\n");
            escolha = teclado.nextInt();
            switch (escolha) {
                case 1: {
                    System.out.println("Insira um ano:");
                    int ano =  teclado.nextInt();
                    local.buscaBolsistaZero(bolsistas,ano);
                }break;
                case 2: {
                    teclado.nextLine();
                    String nome = "";
                    System.out.println("Por favor, insira um nome: ");
                    nome = teclado.nextLine();
                    local.buscaBolsista(bolsistas,nome);
                }break;
                case 3: {
                    System.out.println("Insira um ano:");
                    int ano = teclado.nextInt();
                    local.buscaMediaValoresAno(bolsistas,ano);
                }break;
                case 4: {
                    local.buscaRank(bolsistas);
                }break;
                case 0: {
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
