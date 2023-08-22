/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pecasxadrez;

import tabuleiroxadrez.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

/**
 *
 * @author leona
 */
public class Rei extends PecaDeXadrez{

    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }
    
    @Override
    public String toString(){
        return "R";
    }
    
}
