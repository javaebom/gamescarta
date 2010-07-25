package jogo.classescomum;


/**
 * Interface Jogo do projeto.
 * @author Wilson
 * @author Andre
 */
public abstract class Jogo {

    public abstract void iniciarJogo();

    public abstract void parabenizar();

    public abstract void encerrarPrograma();

    public abstract void configVisibilidadeFileiras();

    /**
     * Metodo responsavel por distribuir as cartas pelas fileiras
     * @param pilha A pilha que receberá as cartas
     * @param baralho O baralho que será utilizado no jogo
     * @param posicaoInicial A posição da primeira carta do baralho a ser enviada para a pilha
     * @param posicaoFinal A posição da ultima carta do baralho a ser enviada para a pilha
     */
    public void distribuirCartas(Pilha pilha,Baralho baralho, int posicaoInicial, int posicaoFinal) {
        for (int i = posicaoInicial; i < posicaoFinal; i++) {
            pilha.getPilha().push(baralho.capturaCarta(i));
        }
    }
}
