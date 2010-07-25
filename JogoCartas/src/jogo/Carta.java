package jogo;

/**
 * Classe que representa uma carta do jogo.
 * @author Wilson
 * @author Andre
 */
public class Carta {

    private int numero;
    private String nipe;
    private String cor;
    private boolean virada;

    /**
     * Determina o nipe de uma carta
     * @param naipe - String referente ao nipe da carta
     */
    public void setNaipe(String naipe) {
        this.nipe = naipe;
    }

    /**
     * Determina o número de uma carta
     * @param numero - inteiro referente ao nipe da cart
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Determina se uma carta estará visível no jogo
     * @param virada - boolean o qual true representa visível e false não visível
     */
    public void setVirada(boolean virada) {
        this.virada = virada;
    }

    /**
     * Captura o valor do nipe de uma carta
     * @return - String referente ao nipe da carta
     */
    public String getNipe() {
        return nipe;
    }

    /**
     * Captura o número de uma carta
     * @return - Inteiro referente ao número da carta
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Verifica se a carta esta virada 
     * @return - true se a carta estiver virada e false se não estiver 
     */
    public boolean getVirada() {
        return virada;
    }

    /**
     * Captura a cor da carta
     * @return  String referente a cor da carta
     */
    public String getCor() {

        if (nipe.equals("ESPADA") || nipe.equals("PAUS")) {
            cor = "PRETA";
        } else {
            cor = "VERMELHA";
        }
        return cor;
    }

    /**
     * Define os atributos numero e nipe de uma car simultaneamente
     * @param numero inteiro que define o número da carta
     * @param naipe String que define o nipe da carta
     */
    public void setCarta(int numero, String naipe) {

        this.numero = numero;
        this.nipe = naipe;

    }
}
