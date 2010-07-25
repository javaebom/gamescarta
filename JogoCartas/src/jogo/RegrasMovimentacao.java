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
public abstract class RegrasMovimentacao {

    /**
     * Método abstrato responsável por verificar se a movimentação é válida.
     * Esse método será implementado pelas classes que representam as regras de cada pilha
     * @param valor inteiro referente ao número da carta
     * @param nipe String referente ao nipe da carta
     * @param pilhaOrigem Pilha de origem da carta a(s) ser movida
     * @param pilhaDestino Pilha de destino a qual a(s) carta sera adicionada
     * @return true se a movimentação foi permitida e false caso contrario
     */
    public abstract boolean verificaMovimentacao(int value, String nipe, Pilha origem, Pilha destino);

    /**
     * Verifica se a pilha esta vazia
     * @param pilha Pilha a ser analisada
     * @return true se estiver vazia, false caso contrario
     */
    public boolean pilhaVazia(Pilha pilha) {
        if (pilha.getPilha().empty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se um determinado conjunto de cartas, representado por uma pilha, está obedecendo
     * a regra da descendência
     * @param pilhaAuxiliar Pilha de cartas a ser analisada
     * @return true se estiver na ordem descendente, false caso contrario
     */
    public boolean verificaDescendenciaDeConjuntoDeCarta(Stack<Carta> pilhaAuxiliar) {
        if (pilhaAuxiliar.size() != 1) {
            for (int i = 0; i < pilhaAuxiliar.size() - 1; i++) {
                if (pilhaAuxiliar.get(i + 1).getNumero() == pilhaAuxiliar.get(i).getNumero() - 1) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    /**
     * Verifica se um determinado conjunto de cartas, representado por uma pilha, está obedecendo
     * a regra da alternancia de cor
     * @param pilhaAuxiliar Pilha de cartas a ser analisada
     * @return true se estiver com cores alternadas, false caso contrario
     */
    public boolean verificaAlternanciaDeCorDeConjuntoDeCarta(Stack<Carta> pilhaAuxiliar) {
        if (pilhaAuxiliar.size() != 1) {
            for (int i = 0; i < pilhaAuxiliar.size() - 1; i++) {
                if (!pilhaAuxiliar.get(i + 1).getCor().equals(pilhaAuxiliar.get(i).getCor())) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }

    }

    /**
     * Verifica se a carta topo de uma pilha tem a mesma cor que foi informada como parâmetro
     * @param pilha Pilha a ser analisada
     * @param cor Cor a ser comparada
     * @return true se foram da mesma cor, false caso contrario
     */
    public boolean corAlternada(Pilha pilha, String cor) {
        System.out.println("Regras Movimentação - Entrei no cor alternada");
        System.out.println("Regras Movimentação - Cor Origem: " + cor);
        System.out.println("Regras Movimentação - Cor Destino: " + pilha.getPilha().peek().getCor());
        if (!pilha.getPilha().peek().getCor().equals(cor)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se a carta topo de uma pilha tem o mesmo nipe que foi informada como parâmetro
     * @param pilha Pilha a ser analisada
     * @param nipe nipe a ser comparado
     * @return true se foram do mesmo nipe, false caso contrario
     */
    public boolean mesmoNipe(Pilha pilha, String nipe) {
        if (pilha.getPilha().peek().getNipe().equals(nipe)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Analisa os valores dos numeros da carta topo de uma pilha com um número informado como parâmetro
     * e verifica se são ascendentes
     * @param pilha Pilha a ser analisada
     * @param valor número da carta a ser comparada
     * @return true se for ascendente, false caso contrário
     */
    public boolean ascendente(Pilha pilha, int valor) {
        if (valor == pilha.getPilha().peek().getNumero() + 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Analisa os valores dos numeros da carta topo de uma pilha com um número informado como parâmetro
     * e verifica se são descendentes
     * @param pilha Pilha a ser analisada
     * @param valor número da carta a ser comparada
     * @return true se for descendente, false caso contrário
     */
    public boolean descendente(Pilha pilha, int valor) {
        System.out.println("Entrei na Descendencia ");
        System.out.println("Entrei na Descendencia: valor da destino: " + pilha.getPilha().peek().getNumero());
        System.out.println("Entrei na Descendencia: valor da origem: " + valor);

        if (valor == pilha.getPilha().peek().getNumero() - 1) {
            System.out.println("Entrei no if, eh descendente");
            return true;
        } else {
            return false;
        }
    }

    /**
     * Analisa se um número passado como parametro refere-se a uma carta K
     * @param valor Valor da carta a ser analisado
     * @return true se for K, false caso contrario
     */
    public boolean eK(int valor) {
        if (valor == 13) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Analisa se um número passado como parametro refere-se a uma carta As
     * @param valor Valor da carta a ser analisado
     * @return true se for As, false caso contrario
     */
    public boolean eAs(int valor) {
        if (valor == 1) {
            return true;
        } else {
            return false;
        }
    }
}
