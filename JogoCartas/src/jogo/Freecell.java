package jogo;

import java.util.ArrayList;

/**
 * Essa classe é responsável por todo o controle do jogo de Freecell.
 * Todas as açoes referentes ao jogo, o iniciar jogo, parabenizar jogador, mover cartas de locais,
 * entre outros, são manipulados por essa classe.
 * @author User
 */
public class Freecell extends Jogo {

    //Cria baralho
   public Baralho baralho = new Baralho();
    //Inicialização de todas as pilhas
    public Fundacao fundacao1 = new Fundacao();
    public Fundacao fundacao2 = new Fundacao();
    public Fundacao fundacao3 = new Fundacao();
    public Fundacao fundacao4 = new Fundacao();
    public Fileiras fileira1 = new Fileiras();
    public Fileiras fileira2 = new Fileiras();
    public Fileiras fileira3 = new Fileiras();
    public Fileiras fileira4 = new Fileiras();
    public Fileiras fileira5 = new Fileiras();
    public Fileiras fileira6 = new Fileiras();
    public Fileiras fileira7 = new Fileiras();
    public Fileiras fileira8 = new Fileiras();
    public CelulaLivre celula1 = new CelulaLivre();
    public CelulaLivre celula2 = new CelulaLivre();
    public CelulaLivre celula3 = new CelulaLivre();
    public CelulaLivre celula4 = new CelulaLivre();
    public ArrayList<Pilha> pilhas = new ArrayList<Pilha>();

    /**
     * Metodo responsável por iniciar o jogo de Freecell.
     * Atribuir o baralho, embaralhar, distribuir as cartas e criar as pilhas.
     */
    @Override
    public void iniciarJogo() {

        //Cria, inicializa e embaralho o baralho

        this.nomeiaPilhas();
        this.agrupaPilhas();

        this.baralho.inicializaBaralho();

        this.baralho.exibeBaralho();
        this.baralho.embaralhaBaralho();

        System.out.println("--------------------------------------------------");

        this.baralho.exibeBaralho();

        distribuirCartas(fileira1, this.baralho, 0, 7);
        distribuirCartas(fileira2, this.baralho, 7, 14);
        distribuirCartas(fileira3, this.baralho, 14, 21);
        distribuirCartas(fileira4, this.baralho, 21, 28);
        distribuirCartas(fileira5, this.baralho, 28, 34);
        distribuirCartas(fileira6, this.baralho, 34, 40);
        distribuirCartas(fileira7, this.baralho, 40, 46);
        distribuirCartas(fileira8, this.baralho, 46, 52);


        System.out.println("--------------------------------------------------");


        fileira1.exibeFileira();
        fileira2.exibeFileira();
        fileira3.exibeFileira();
        fileira4.exibeFileira();
        fileira5.exibeFileira();
        fileira6.exibeFileira();
        fileira7.exibeFileira();
        fileira8.exibeFileira();



        this.configVisibilidadeFileiras();


    }

    /**
     * Método que dá um nome a cada pilha de cartas do jogo
     */
    public void nomeiaPilhas() {
        fundacao1.setNome("Fund1");
        fundacao2.setNome("Fund2");
        fundacao3.setNome("Fund3");
        fundacao4.setNome("Fund4");

        fileira1.setNome("Fi1");
        fileira2.setNome("Fi2");
        fileira3.setNome("Fi3");
        fileira4.setNome("Fi4");
        fileira5.setNome("Fi5");
        fileira6.setNome("Fi6");
        fileira7.setNome("Fi7");
        fileira8.setNome("Fi8");


        celula1.setNome("Cel1");
        celula2.setNome("Cel2");
        celula3.setNome("Cel3");
        celula4.setNome("Cel4");

    }

    /**
     * Método que agrupa em uma só estrutura todas as pilhas de carta do jogo
     */
    public void agrupaPilhas() {


        this.pilhas.add(this.fileira1);
        this.pilhas.add(this.fileira2);
        this.pilhas.add(this.fileira3);
        this.pilhas.add(this.fileira4);
        this.pilhas.add(this.fileira5);
        this.pilhas.add(this.fileira6);
        this.pilhas.add(this.fileira7);
        this.pilhas.add(this.fileira8);
        this.pilhas.add(this.fundacao1);
        this.pilhas.add(this.fundacao2);
        this.pilhas.add(this.fundacao3);
        this.pilhas.add(this.fundacao4);
        this.pilhas.add(this.celula1);
        this.pilhas.add(this.celula2);
        this.pilhas.add(this.celula3);
        this.pilhas.add(this.celula4);

    }

    public void configVisibilidadeFileiras() {

        fileira1.tornarCartaVisivel(7);
        fileira2.tornarCartaVisivel(7);
        fileira3.tornarCartaVisivel(7);
        fileira4.tornarCartaVisivel(7);

        fileira5.tornarCartaVisivel(6);
        fileira6.tornarCartaVisivel(6);
        fileira7.tornarCartaVisivel(6);
        fileira8.tornarCartaVisivel(6);



    }

    /**
     * Método que captura instância de pilha a depender do nome
     * @param nome String que representa nome de uma pilha
     * @return pilha cujo nome foi passado como parâmetro
     */
    public Pilha capturaPilha(String nome) {
        for (int i = 0; i < this.pilhas.size(); i++) {

            System.out.println("this.pilhas.get(i).nome " + this.pilhas.get(i).getNome());
            if (this.pilhas.get(i).getNome().equals(nome)) {

                return this.pilhas.get(i);
            }
        }

        return null;
    }

    /**
     * Metodo responsável por verificar a quantidade de celulas livres que encontram-se vazias
     * @return inteiro referente ao número de celulas vazias
     */
    public int verificarNumeroDeCelulasVazias() {
        int quantidade;
        quantidade = celula1.getPilha().size()
                + celula2.getPilha().size()
                + celula3.getPilha().size()
                + celula4.getPilha().size();
        return quantidade;

    }

    /**
     *Método responsável por mapear a movimentação realizada e chamar as regras que definirão se a carta pode ser movida ou não
     * @param value inteiro que representa o valor da carta a ser movida
     * @param origin string que representa o nome da região de origem da carta
     * @param target string que representa o nome da região de destino da carta
     * @param nipe string que representa o nipe da carta a ser movida
     */
    public boolean moveCard(int value, String nipe, String origem, String destino) {
        //mapeia Strings em Regions
        System.out.println("origem" + origem);
        System.out.println("destino" + destino);

//        return this.celula1.verifyRule(value, nipe, this.fileira1);
        return this.capturaPilha(destino).verifyRule(value, nipe, this.capturaPilha(origem));
    }

    /**
     * Metodo responsável por informar ao usuário que o mesmo venceu o jogo
     */
    @Override
    public void parabenizar() {
        System.out.println("Parabéns, Você finalizou o jogo");

    }

    /**
     * Metodo que encerra o programa.
     */
    @Override
    public void encerrarPrograma() {
        System.exit(0);

    }
}
