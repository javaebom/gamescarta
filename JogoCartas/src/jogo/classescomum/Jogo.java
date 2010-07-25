package jogo.classescomum;

/**
 * Classe abstracao que define o comportamento semelhantes entre os jogos de carta 
 * @author Wilson
 * @author Andre
 */
public abstract class Jogo {

    /**
     * Metodo que inicializa jogo
     */
    public abstract void iniciarJogo();

    /**
     * Metodo que parabeniza jogador
     */
    public abstract void parabenizar();

    /**
     * Metodo que encerra programa
     */
    public abstract void encerrarPrograma();

    /**
     * Método que configura quais cartas são visiveis, quando do inicio do jogo
     */
    public abstract void configVisibilidadeFileiras();

    /**
     * Metodo responsavel por distribuir as cartas pelas fileiras
     * @param pilha A pilha que receberá as cartas
     * @param baralho O baralho que será utilizado no jogo
     * @param posicaoInicial A posição da primeira carta do baralho a ser enviada para a pilha
     * @param posicaoFinal A posição da ultima carta do baralho a ser enviada para a pilha
     */
    public void distribuirCartas(Pilha pilha, Baralho baralho, int posicaoInicial, int posicaoFinal) {
        for (int i = posicaoInicial; i < posicaoFinal; i++) {
            pilha.getPilha().push(baralho.capturaCarta(i));
        }
    }
}
