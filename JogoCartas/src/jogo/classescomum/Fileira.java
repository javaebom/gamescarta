package jogo.classescomum;

import jogo.freecell.RegrasFileiras;


/**
 * Pilha de fileira do jogo de cartas.
 * @author Wilson
 * @author Andre
 */
public class Fileira extends Pilha {

    public Carta cartaViradaTopo;




    /**
     * Construtor
     */
    public Fileira() {

        cartaViradaTopo = new Carta();
        this.regras = new RegrasFileiras();
    }




    /**
     * Vira carta desviarado do topo da pilha de fileira.
     * @param numDeCartas inteiro referente ao número de cartas que devem ser tornadas visíveis
     */
    public void tornarCartaVisivel(int numDeCartas) {

        for (int i = 0; i < numDeCartas; i++) {
            this.getPilha().get(i).setVirada(true);
        }

    }

    /**
     * Carta do topo virada recebe o valor null.
     */
    public void setNullCartaTopo() {
        cartaViradaTopo = null;
    }


    /**
 * Metodo responsável por verificar as regras de movimentação para as pilhas de fundação
 * @param valor inteiro referente ao número da carta
 * @param nipe String referente ao nipe da carta
 * @param origem Pilha de origem da carta a(s) ser movida
 * @return true se a movimentação foi permitida e false caso contrario
 */
    public boolean verifyRule(int valor, String nipe, Pilha origem) {
        return regras.verificaMovimentacao(valor, nipe, origem, this);
    }

}
