package Anthill.model;

/**
 *
 * @author Inflo
 */
public class Source extends Cellule {
    private int qteNourriture;
    public Source(int x, int y){
        super(x,y);
    }

    public int getQteNourriture() {
        return qteNourriture;
    }

    public void setQteNourriture(int qteNourriture) {
        this.qteNourriture = qteNourriture;
    }
    
    public void detruire(){
        
    }
    
    @Override
    public String toString() {
        return "o";
    }

    void diminuerNourriture(Environnement e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
