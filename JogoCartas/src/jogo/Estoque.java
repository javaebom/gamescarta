package jogo;

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

    public Estoque(Baralho baralho){

        Stack estoque = new Stack();
        Carta carta = new Carta();
        
        for (int i = 0; i < QTDADECARTASESTOQUE; i++)
        {
            Object cartaRemovida = baralho.baralho.remove(0);
            carta = (Carta) cartaRemovida;            
            estoque.push(carta);            
        }
    }

    @Override
    public boolean verifyRule(int valor, String nipe, Pilha origem) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
