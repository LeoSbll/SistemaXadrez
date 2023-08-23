package tabuleiroxadrez;

/**
 *
 * @author leona
 */
public class Peca {
    
    protected Tabuleiro tabuleiro;
    Posicao posicao;

    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        posicao = null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }  
    
}
