/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.freecell;

import java.util.Stack;
import jogo.classescomum.Carta;
import jogo.classescomum.Pilha;
import jogo.classescomum.RegrasMovimentacao;

/**
 *Classe que define as regras do jogo quando cartas são movimentadas para uma fileira
 * @author Fernanda e Igo
 */


// Regras de fileira:
//Se estiver vazia, pode receber cartas que não é K. Diferente do paciência.
//Precisa obedecer a regra da descendência e da alternância de cor
//Precisa obedecer tmbem a regra da quantidada de células livres vazias
//
//
//Passos da verificação:
//- primeira verificação: se a pilha estar vazia ou não.
//Se estiver vazia, pode ser adicionada qualquer carta. Não é que nem o paciencia que só podia ser o K.
//Dai então, precisa-se verificar que, caso seja um conjunto de cartas a ser movido, se dentre esse conjunto as
//cartas estão obedecendo a regra da descendência e da alternancia de cor.
//Por isso o método de removercarta armazena a pilhaAuxiliar num objeto que será então verificado pelos métodos:
//verificaAlternanciaDeCorDeConjuntoDeCarta e verificaDescendenciaDeConjuntoDeCarta
//Sendo assim, caso a verificação passe, então é add o conjunto de cartas na pilhaDestino, caso contrário,
//o conjunto de cartas volta a ser add na pilhaOrigem.
//
//
//-Se a pilha não estiver vazia:
//Então é verificado a alternacia de cor e a descendencia entre a carta e a carta topo da pilha de destino
//passando essa verificação, é então seguido os mesmos passos de verificação do conjunto de cartas descrito anteriormente
//para que enfim a movimentação seja efetuada ou não.



public class RegrasFileiras extends RegrasMovimentacao {

 

    /**
     * Implementação do método que analisa se a movimentação de uma ou mais cartas para as fileiras
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
            Stack<Carta> pilhaAuxiliar = pilhaOrigem.removerCarta(pilhaOrigem.selecionarCarta(valor, nipe));
            if (pilhaAuxiliar.size() <= pilhaOrigem.getQtdMaxCartasMover()) {
                if (this.verificaAlternanciaDeCorDeConjuntoDeCarta(pilhaAuxiliar)) {
                    if (this.verificaDescendenciaDeConjuntoDeCarta(pilhaAuxiliar)) {
                        pilhaDestino.adicionarCarta(pilhaAuxiliar);
                        return true;
                    } else {
                        pilhaOrigem.adicionarCarta(pilhaAuxiliar);
                        return false;
                    }
                } else {
                    pilhaOrigem.adicionarCarta(pilhaAuxiliar);
                    return false;

                }
            } else {
                pilhaOrigem.adicionarCarta(pilhaAuxiliar);
                return false;
            }

        } else {
            if (this.corAlternada(pilhaDestino, pilhaOrigem.selecionarCarta(valor, nipe).getCor())) {
                if (this.descendente(pilhaDestino, pilhaOrigem.selecionarCarta(valor, nipe).getNumero())) {
                    Stack<Carta> pilhaAuxiliar = pilhaOrigem.removerCarta(pilhaOrigem.selecionarCarta(valor, nipe));
                    if (pilhaAuxiliar.size() <= pilhaOrigem.getQtdMaxCartasMover()) {
                        if (this.verificaAlternanciaDeCorDeConjuntoDeCarta(pilhaAuxiliar)) {
                            if (this.verificaDescendenciaDeConjuntoDeCarta(pilhaAuxiliar)) {
                                pilhaDestino.adicionarCarta(pilhaAuxiliar);
                                return true;
                            } else {
                                pilhaOrigem.adicionarCarta(pilhaAuxiliar);
                                return false;
                            }
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
                return false;
            }
        }
        return false;
    }




}
