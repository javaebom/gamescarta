package jogo;

import java.util.Stack;

/**
 * Classe abstrata utilizada a fim de organizar a estrutura do projeto.
 * Esta representa cada pilha utilizada no jogo para manipular as cartas
 * @author Wilson
 * @author Andre
 */
public abstract class Pilha {

    Stack<Carta> pilha = new Stack<Carta>();
    RegrasMovimentacao regras;
    public String nome;

    /**
     * Metodo responsável por verificar as regras de movimentação de cartas para as pilhas
     * @param valor inteiro referente ao número da carta
     * @param nipe String referente ao nipe da carta
     * @param origem Pilha de origem da carta a(s) ser movida
     * @return true se a movimentação foi permitida e false caso contrario
     */
    public abstract boolean verifyRule(int valor, String nipe, Pilha origem);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Adiciona um conjunto de cartas a uma Pilha
     * @param pilhaAuxiliar Conjunto de cartas a ser adicionado
     */
    public void adicionarCarta(Stack<Carta> pilhaAuxiliar) {
        for (int i = pilhaAuxiliar.size(); i > 0; i--) {
            this.pilha.push(pilhaAuxiliar.remove(0));
        }
    }

    /**
     * Remove um conjunto de carta de uma pilha e retorna essas cartas.
     * A partir da carta informada como parâmetro esta é localizada na pilha e então
     * retirada todas as cartas posteriores a mesma, formando assim um novo conjunto de cartas
     * @param carta Carta referência que será removida
     * @return um conjunto de cartas na forma de pilha
     */
    public Stack<Carta> removerCarta(Carta carta) {
        Stack<Carta> pilhaAuxiliar = new Stack<Carta>();
        int ponteiro = 0;
        int posicao = posicaoCarta(carta);
        while (ponteiro <= posicao) {
            pilhaAuxiliar.push(this.pilha.remove(0));
            ponteiro++;
        }
        return pilhaAuxiliar;
    }

    /**
     * Metodo responsável por retornar a posição da carta
     * @param carta Carta que será buscada na pilha
     * @return a posição na pilha da carta.
     */
    public int posicaoCarta(Carta carta) {
        return pilha.indexOf(carta);
    }

    /**
     * Captura a pilha de cartas
     * @return pilha de cartas
     */
    public Stack<Carta> getPilha() {
        return pilha;
    }

    /**
     * Retorna uma determinada carta da pilha
     * @param valor inteiro que representa o valor da carta
     * @param nipe string que representa o nipe
     * @return objeto carta
     */
    public Carta selecionaCarta(int valor, String nipe) {
        for (int i = 0; i < this.getPilha().size(); i++) {
            if (this.getPilha().get(i).getNipe().equals(nipe) && this.getPilha().get(i).getNumero() == valor) {
                return this.getPilha().get(i);
            }
        }
        return null;
    }
}