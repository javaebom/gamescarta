package jogo;

import java.util.Stack;

/**
 * Pilha de fundacao do jogo de cartas.
 * @author Wilson
 * @author Andre
 */

public class Fundacao extends Pilha{

    
    public Fundacao() {
        this.regras = new RegrasFundacoes();
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
