/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.Stack;

/**
 *
 * @author User
 */
public class RegrasCelulas extends RegrasMovimentacao {

    /**
     * Implementação do método que analisa se a movimentação de uma ou mais cartas para as pilhas
     * de Celulas livres é permitida. Ou seja, metodo onde as regras são verificadas.
     * @param valor inteiro referente ao número da carta
     * @param nipe String referente ao nipe da carta
     * @param pilhaOrigem Pilha de origem da carta a(s) ser movida
     * @param pilhaDestino Pilha de destino a qual a(s) carta sera adicionada
     * @return true se a movimentação foi permitida e false caso contrario
     */
    @Override
    public boolean verificaMovimentacao(int valor, String nipe, Pilha pilhaOrigem, Pilha pilhaDestino) {

        if (this.pilhaVazia(pilhaDestino)) {
            Stack<Carta> pilhaAuxiliar = pilhaOrigem.removerCarta(pilhaOrigem.selecionaCarta(valor, nipe));
            if (pilhaAuxiliar.size() == 1) {
                pilhaDestino.adicionarCarta(pilhaAuxiliar);
                return true;
            } else {
                pilhaOrigem.adicionarCarta(pilhaAuxiliar);
                return false;
            }
        } else {
            return false;
        }
    }
}
