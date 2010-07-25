package jogo.paciencia;

import jogo.classescomum.Pilha;

;

import java.util.Stack;

/**
 * Pilha de estoque do jogo paciencia.
 * @author Wilson
 * @author Andre
 */

public class Estoque extends Pilha {

    final int QTDADECARTASESTOQUE = 24;

    /**
     * Construtor
     */

    public Estoque(){

    }

    @Override
    public boolean verifyRule(int valor, String nipe, Pilha origem) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
