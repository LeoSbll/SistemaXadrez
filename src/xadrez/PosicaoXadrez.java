package xadrez;

import tabuleiroxadrez.Posicao;

/**
 *
 * @author leona
 */
public class PosicaoXadrez {
    private char coluna;
    private int linha;

    public PosicaoXadrez(char coluna, int linha) {
        if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8 ){
            throw new ExcecaoXadrez("O números de linhas e colunas excederam ou não atingiram o limite");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }
    
    protected Posicao toPosicao(){
        return new Posicao(8 - linha, coluna - 'a');
    }
    
    protected static PosicaoXadrez daPosicao(Posicao posicao){
        return new PosicaoXadrez((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
        
    }
    
    @Override
    public String toString(){
        return "" + coluna + linha;
    }
}   

