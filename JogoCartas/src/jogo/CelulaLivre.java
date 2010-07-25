package jogo;

import java.util.Stack;

/**
 * Classe que representa uma instância de uma célula Livre.
 * Essa classe representa a pilha que armazenará as cartas nessa pilha.
 * @author Fernanda & Igo
 */
public class CelulaLivre extends Pilha {

    public CelulaLivre() {
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
