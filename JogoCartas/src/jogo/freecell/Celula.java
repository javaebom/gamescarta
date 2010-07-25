package jogo.freecell;

import jogo.classescomum.Pilha;

/**
 * Classe que representa uma instância de uma célula.
 * 
 * @author Fernanda & Igo
 */
public class Celula extends Pilha {

    public Celula() {
        this.regras = new RegrasCelulas();
        }

    /**
 * Metodo responsável por verificar as regras de movimentação para as pilhas de celulas
 * @param valor inteiro referente ao número da carta
 * @param nipe String referente ao nipe da carta
 * @param origem Pilha de origem da carta a(s) ser movida
 * @return true se a movimentação foi permitida e false caso contrario
 */
    public boolean verifyRule(int valor, String nipe, Pilha origem) {
        return regras.verificaMovimentacao(valor, nipe, origem, this);
    }
}
