package jogo;

import java.util.Stack;

/**
 * Pilha de descarte do jogo paciencia.
 * @author Wilson
 * @author Andre
 */

public class Descarte extends Pilha{

    Carta cartaTopo;
    public Stack pilhaDescarte;

    /**
     * Construtor
     */
    public Descarte(){

        pilhaDescarte = new Stack();        
    }

    /*
     * Vira uma carta da pilha de estoque e coloca na pilha de descarte.
     * @return Carta da pilha
     */
    public Carta virarUmaCartaPilhaEstoque(Stack estoque){

        Object cartaRemovida = estoque.pop();
        Carta carta = (Carta) cartaRemovida;
        cartaTopo = carta;
        pilhaDescarte.push(cartaTopo);
        return cartaTopo;
    }

    /*
     * Vira tres carta da pilha de estoque e coloca na pilha de descarte.
     * @return Carta da pilha
     */
    public Carta virarTresCartasPilhaEstoque(Stack estoque){

        for(int i = 0; i < 3; i++)
        {
            Object cartaRemovida = estoque.pop();
            Carta carta = (Carta) cartaRemovida;
            cartaTopo = carta;
            pilhaDescarte.push(cartaTopo);
        }
        return cartaTopo;
    }

    @Override
    public boolean verifyRule(int valor, String nipe, Pilha origem) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
