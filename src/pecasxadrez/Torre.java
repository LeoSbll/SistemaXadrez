package pecasxadrez;

import tabuleiroxadrez.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

/**
 *
 * @author leona
 */
public class Torre extends PecaDeXadrez {

    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    
    }
    
    @Override
    public String toString(){
        return "T";
    }
    
    
}
