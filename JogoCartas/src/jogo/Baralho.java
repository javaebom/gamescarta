package jogo;

import java.util.Collections;
import java.util.Vector;

/**
 * Classe que representa um baralho com 52 cartas.
 * @author Wilson
 * @author Andre
 */


public class Baralho {

    public Vector<Carta> baralho = new Vector<Carta>(52);;

    /*
     * Inicializa o baralho com 52 cartas.
     */
    public void inicializaBaralho(){

        Carta carta;

        for(int i = 0; i < 52; i++){
            
            carta = new Carta();
            
            if(i < 13){
                carta.setNumero(i + 1);
                carta.setNaipe("ESPADA");
            }
            else if(i >= 13 && i < 26){
                carta.setNumero(i - 12);
                carta.setNaipe("PAUS");
            }
            else if(i >= 26 && i < 39){
                carta.setNumero(i - 25);
                carta.setNaipe("COPAS");
            }
            else if(i >= 39 && i < 52){
                carta.setNumero(i - 38);
                carta.setNaipe("OURO");
            }
            
            baralho.add(carta);
        }        
    }


    /**
     * Embaralha o baralho
     */
    public void embaralhaBaralho(){

        Collections.shuffle(baralho);
        
    }


    public void exibeBaralho(){
        for(int i = 0; i < 52; i++){
            System.out.println("Carta " + i + " -> " +
                    "Valor " + this.baralho.get(i).getNumero() +
                    " / Nipe " + this.baralho.get(i).getNipe());
        }

    }

    /**
     * Obter o número de cartas contidas no baralho
     * @return número inteiro que representa o tamanho do baralho
     */
    public int tamanhoBaralho() {
        return this.baralho.size();
    }

    /**
     * A partir da posição de um elemento do baralho, este método retorna o objeto
     * contido nessa posição
     * @param posicao - inteiro referente a posição da carta no baralho
     * @return objeto carta que ocupa a posição informada
     */
    public Carta capturaCarta(int posicao){
        System.out.println("this.baralho.get(posicao) " + this.baralho.get(posicao).getNumero());
        return this.baralho.get(posicao);
    }


}