package tabuleiroxadrez;

/**
 *
 * @author leona
 */
public class Tabuleiro {
    
    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        if(linhas < 1 || colunas < 1){
            throw new ExcecoesDeTabuleiro("Necessário que haja pelo menos uma linha e uma coluna");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }
    
    public Peca peca(int linha,int coluna){
        return pecas[linha][coluna];
    }
    
    public Peca peca(Posicao posicao){
         if(!posicaoExistente(posicao)){
            throw new ExcecoesDeTabuleiro("Posição não se encontra no tabuleiro");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }
    public void lugarDaPeca(Peca peca, Posicao posicao){
        if(haUmaPeca(posicao)){
            throw new ExcecoesDeTabuleiro("Já a uma peça nessa posição " + posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }
    
    private boolean posicaoExistente(int linha, int coluna){
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
        
    }
    
    public boolean posicaoExistente(Posicao posicao){
        return posicaoExistente(posicao.getLinha(),posicao.getColuna());
    }
     
    public boolean haUmaPeca(Posicao posicao){
        if(!posicaoExistente(posicao)){
            throw new ExcecoesDeTabuleiro("Posição não se encontra no tabuleiro");
        }
        return peca(posicao) != null;
    }
}
