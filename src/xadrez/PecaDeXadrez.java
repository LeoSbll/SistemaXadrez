package xadrez;

import tabuleiroxadrez.Peca;
import tabuleiroxadrez.Tabuleiro;

/**
 *
 * @author leona
 */
public class PecaDeXadrez extends Peca {
    
    private Cor cor;

   public PecaDeXadrez(Tabuleiro tabuleiro,Cor cor) {
       super(tabuleiro);
        this.cor = cor;
        
    }

    public void getCor(Cor cor) {
        this.cor = cor;
    }
    
    
}
