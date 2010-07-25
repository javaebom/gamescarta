package jogo.classescomum;

import java.util.Stack;

/**
 * Classe abstrata que define comportamento semelhante entre todas as pilhas do jogo
 * 
 * @author Wilson
 * @author Andre
 */
public abstract class Pilha {

    public Stack<Carta> pilha = new Stack<Carta>();
    public RegrasMovimentacao regras;
    public String nome;
    public int qtdMaxCartasMover = 5;

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
            this.pilha.push(pilhaAuxiliar.pop());
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
        int posicao = capturarPosicaoCarta(carta);
        while (ponteiro <= posicao) {
            pilhaAuxiliar.push(this.pilha.pop());
            ponteiro++;
        }
        return pilhaAuxiliar;
    }

    /**
     * Metodo responsável por retornar a posição da carta
     * @param carta Carta que será buscada na pilha
     * @return a posição na pilha da carta.
     */
    public int capturarPosicaoCarta(Carta carta) {
        return pilha.size() - pilha.indexOf(carta) - 1;
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
    public Carta selecionarCarta(int valor, String nipe) {
        for (int i = 0; i < this.getPilha().size(); i++) {
            if (this.getPilha().get(i).getNipe().equals(nipe) && this.getPilha().get(i).getNumero() == valor) {
                return this.getPilha().get(i);
            }
        }
        return null;
    }


         /**
     * Captura o número de cartas que podem ser movidas de uma fileira
     * @return inteiro referente ao número de celulas livres ocupadas
     */
    public int getQtdMaxCartasMover() {
        System.out.println("QUANTIDADE DE CARTAS QUE PODEM SER MOVIDAS: " + this.qtdMaxCartasMover);
        return qtdMaxCartasMover;
    }


    /**
     * Define o número de cartas que podem ser movidas de uma fileira, a depender do numedo de celulas livre
     * @param numeroCelulasVazias inteiro referente ao número de celulas ocupadas
     */

    public void setQtdMaxCartasMover(int numCelulasLivre) {
        this.qtdMaxCartasMover = numCelulasLivre + 1;
    }
}
