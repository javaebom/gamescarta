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

    int numeroCelulasVazias;

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

        System.out.println("VF  pilha origem" + pilhaOrigem.getNome());
         System.out.println("VF  pilha destino" + pilhaDestino.getNome());

        if (this.pilhaVazia(pilhaDestino)) {
            Stack<Carta> pilhaAuxiliar = pilhaOrigem.removerCarta(pilhaOrigem.selecionaCarta(valor, nipe));
            if (pilhaAuxiliar.size() <= this.capturaQtdCartasPodemSerMovidas()) {
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
            if (this.corAlternada(pilhaDestino, pilhaOrigem.selecionaCarta(valor, nipe).getCor())) {
                if (this.descendente(pilhaDestino, pilhaOrigem.selecionaCarta(valor, nipe).getNumero())) {
                    Stack<Carta> pilhaAuxiliar = pilhaOrigem.removerCarta(pilhaOrigem.selecionaCarta(valor, nipe));
                    if (pilhaAuxiliar.size() <= this.capturaQtdCartasPodemSerMovidas()) {
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

    /**
     * Captura o número de células livres ocupadas
     * @return inteiro referente ao número de celulas livres ocupadas
     */
    public int getNumeroCelulasOcupadas() {
        return numeroCelulasVazias;
    }

    /**
     * Define o número de celulas livres ocupadas
     * @param numeroCelulasVazias inteiro referente ao número de celulas ocupadas
     */
    public void setNumeroCelulasOcupadas(int numeroCelulasVazias) {
        this.numeroCelulasVazias = numeroCelulasVazias;
    }

    /**
     * Captura o número de cartas de fileiras que poderão ser movidas em conjunto.
     * @return
     */
    public int capturaQtdCartasPodemSerMovidas() {

        return (getNumeroCelulasOcupadas() + 1);
    }
}
