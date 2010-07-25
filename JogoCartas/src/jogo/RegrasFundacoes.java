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
public class RegrasFundacoes extends RegrasMovimentacao {

    //Ascendecia
    //mesmo nipe
    //se tiver vazia, comecao com as
    /**
     * Implementação do método que analisa se a movimentação de uma ou mais cartas para as fundações
     * de Celulas livres é permitida. Ou seja, metodo onde as regras são verificadas.
     * @param valor inteiro referente ao número da carta
     * @param nipe String referente ao nipe da carta
     * @param pilhaOrigem Pilha de origem da carta a(s) ser movida
     * @param pilhaDestino Pilha de destino a qual a(s) carta sera adicionada
     * @return true se a movimentação foi permitida e false caso contrario
     */
    @Override
    public boolean verificaMovimentacao(int valor, String nipe, Pilha pilhaOrigem, Pilha pilhaDestino) {

        Stack<Carta> pilhaAuxiliar = pilhaOrigem.removerCarta(pilhaOrigem.selecionaCarta(valor, nipe));


        //Se somente uma carta esta sendo movida pra fundacao
        if (pilhaAuxiliar.size() == 1) {

            //Se a fundacao estiver vazia e a carta movida for um As
            if (this.pilhaVazia(pilhaDestino)) {
                if (this.eAs(pilhaAuxiliar.get(0).getNumero())) {
                    pilhaDestino.adicionarCarta(pilhaAuxiliar);
                    return true;
                } else {
                    pilhaOrigem.adicionarCarta(pilhaAuxiliar);
                    return false;
                }
            } else {

                //Se a carta movida é do mesmo nipe das cartas que ja estao nas fundacoes e for maior
                if (this.mesmoNipe(pilhaDestino, pilhaAuxiliar.get(0).getNipe())) {
                    if (this.ascendente(pilhaDestino, pilhaAuxiliar.get(0).getNumero())) {
                        pilhaDestino.adicionarCarta(pilhaAuxiliar);
                    } else {
                        pilhaOrigem.adicionarCarta(pilhaAuxiliar);
                        return false;
                    }

                } else {

                    pilhaOrigem.adicionarCarta(pilhaAuxiliar);
                    return false;
                }
            }
        } else {

            pilhaOrigem.adicionarCarta(pilhaAuxiliar);
            return false;
        }

        return false;
    }
}
