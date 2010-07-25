package jogo;

/**
 * Classe principal de inicializacao do jogo Paciencia.
 * @author Wilson
 * @author Andre
 */
public class Paciencia extends Jogo {

    //Inicialização de todas as pilhas
    Baralho baralho = new Baralho();
    Estoque estoque = new Estoque();
    Descarte descarte = new Descarte();
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


    /*
     * Metodo responsavel por iniciar o jogo de Paciencia.
     */
    @Override
    public void iniciarJogo() {

        //Cria, inicializa e embaralho o baralho
        baralho.inicializaBaralho();
        baralho.embaralhaBaralho();


        distribuirCartas(fileira1, this.baralho, 0, 1);
        distribuirCartas(fileira2, this.baralho, 1, 3);
        distribuirCartas(fileira3, this.baralho, 3, 6);
        distribuirCartas(fileira4, this.baralho, 6, 10);
        distribuirCartas(fileira5, this.baralho, 10, 15);
        distribuirCartas(fileira6, this.baralho, 15, 21);
        distribuirCartas(fileira7, this.baralho, 21, 28);

        distribuirCartas(estoque, baralho, 28, 51);


    }

    public void configVisibilidadeFileiras() {

        fileira1.tornarCartaVisivel(1);
        fileira2.tornarCartaVisivel(1);
        fileira3.tornarCartaVisivel(1);
        fileira4.tornarCartaVisivel(1);
        fileira5.tornarCartaVisivel(1);
        fileira6.tornarCartaVisivel(1);
        fileira7.tornarCartaVisivel(1);


        this.configVisibilidadeFileiras();


    }

    /*
     * Metodo feito para enviar uma mensagem para quem finalizar o jogo.
     */
    @Override
    public void parabenizar() {
        System.out.println("Parabéns, Você finalizou o jogo");

    }


    /*
     *Metodo que encerra o programa.
     */
    @Override
    public void encerrarPrograma() {
        System.exit(0);

    }
}
