package tabuleiroxadrez;

/**
 *
 * @author leona
 */
public class ExcecoesDeTabuleiro extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public ExcecoesDeTabuleiro(String msg){
        super(msg);
    } 
}
