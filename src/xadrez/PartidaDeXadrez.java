package xadrez;

import pecasxadrez.Torre;
import tabuleiroxadrez.Tabuleiro;

/**
 *
 * @author leona
 */
public class PartidaDeXadrez {
    
    private Tabuleiro tabuleiro;
    
    public PartidaDeXadrez(){
        tabuleiro = new Tabuleiro(8, 8);
        inicioJogo();
    }
    
    public PecaDeXadrez[][] getPecas(){
        PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i=0; i<tabuleiro.getLinhas(); i++){
            for(int j=0; j<tabuleiro.getColunas(); j++){
                mat[i][j] = (PecaDeXadrez)tabuleiro.peca(i, j);
            }
        }
        return mat;
    }
    private void lugarDaNovaPeca(char coluna, int linha, PecaDeXadrez peca){
        tabuleiro.lugarDaPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
        
    }
    
    private void inicioJogo(){
        lugarDaNovaPeca('a', 8, new Torre(tabuleiro, Cor.BRANCO));
        lugarDaNovaPeca('h', 8, new Torre(tabuleiro, Cor.BRANCO));
        lugarDaNovaPeca('a', 1, new Torre(tabuleiro, Cor.PRETO));
    }

}