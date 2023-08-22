package sistemaxadrez;

import xadrez.PartidaDeXadrez;

/**
 *
 * @author leona
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        PartidaDeXadrez partida = new PartidaDeXadrez();
        InterfaceDoUsuario.printTabuleiro(partida.getPecas());
        
    }
    
}
